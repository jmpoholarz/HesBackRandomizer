package net.highwayfrogs.editor.file.mof.animation;

import lombok.Getter;
import net.highwayfrogs.editor.file.mof.*;
import net.highwayfrogs.editor.file.mof.animation.transform.TransformObject;
import net.highwayfrogs.editor.file.mof.animation.transform.TransformType;
import net.highwayfrogs.editor.file.reader.DataReader;
import net.highwayfrogs.editor.file.standard.IVector;
import net.highwayfrogs.editor.file.standard.SVector;
import net.highwayfrogs.editor.file.standard.psx.PSXMatrix;
import net.highwayfrogs.editor.file.writer.ArrayReceiver;
import net.highwayfrogs.editor.file.writer.DataWriter;
import net.highwayfrogs.editor.utils.Utils;

/**
 * Represents the MR_ANIM_HEADER struct.
 * Must be encapsulated under MOFFile.
 * Created by Kneesnap on 8/25/2018.
 */
@Getter
public class MOFAnimation extends MOFBase {
    private MOFAnimationModelSet modelSet;
    private MOFFile staticMOF;
    private MOFAnimCommonData commonData;

    public static final byte FILE_START_FRAME_AT_ZERO = (byte) 0x31; // '1'
    private static final int STATIC_MOF_COUNT = 1;

    public MOFAnimation(MOFHolder holder) {
        super(holder);
    }

    @Override
    public void onLoad(DataReader reader) {
        Utils.verify(shouldStartAtFrameZero(), "Animations which do not start at frame-zero are not currently supported.");

        int modelSetCount = reader.readUnsignedShortAsInt();
        int staticFileCount = reader.readUnsignedShortAsInt();
        int modelSetPointer = reader.readInt();   // Right after header.
        int commonDataPointer = reader.readInt(); // Right after model set data.
        int staticFilePointer = reader.readInt(); // After common data pointer.

        Utils.verify(modelSetCount == 1, "Multiple model sets are not supported by FrogLord. (%d)", modelSetCount);
        Utils.verify(staticFileCount == 1, "FrogLord only supports one MOF. (%d)", staticFileCount);

        // Read model sets.
        reader.jumpTemp(modelSetPointer);
        this.modelSet = new MOFAnimationModelSet(this);
        this.modelSet.load(reader);
        reader.jumpReturn();

        // Read common data.
        reader.jumpTemp(commonDataPointer);
        this.commonData = new MOFAnimCommonData(this);
        this.commonData.load(reader);
        reader.jumpReturn();

        reader.jumpTemp(staticFilePointer);
        int mofPointer = reader.readInt();
        reader.jumpReturn();

        DataReader mofReader = reader.newReader(mofPointer, staticFilePointer - mofPointer);
        this.staticMOF = new MOFFile(getHolder());
        this.staticMOF.load(mofReader);
    }

    @Override
    public void onSave(DataWriter writer) {
        writer.writeUnsignedShort(1); // Model Set Count.
        writer.writeUnsignedShort(STATIC_MOF_COUNT);

        int modelSetPointer = writer.writeNullPointer(); // Right after header.
        int commonDataPointer = writer.writeNullPointer(); // Right after model set data.
        int staticFilePointer = writer.writeNullPointer(); // After common data.

        // Write model sets.
        writer.writeAddressTo(modelSetPointer);
        this.modelSet.save(writer);

        // Write common data.
        writer.writeAddressTo(commonDataPointer);
        this.commonData.save(writer);

        // Write static MOF.
        int mofPointer = writer.getIndex();
        ArrayReceiver receiver = new ArrayReceiver();
        DataWriter mofWriter = new DataWriter(receiver);
        getStaticMOF().save(mofWriter);
        mofWriter.closeReceiver();
        writer.writeBytes(receiver.toArray());

        // Write pointers.
        writer.writeAddressTo(staticFilePointer);
        writer.writeInt(mofPointer);
    }

    /**
     * Does this animation start at frame zero?
     * @return startAtFrameZero
     */
    public boolean shouldStartAtFrameZero() {
        return getSignature()[0] == FILE_START_FRAME_AT_ZERO;
    }

    /**
     * Get the TransformType for this animation.
     * @return transformType.
     */
    public TransformType getTransformType() {
        return TransformType.getType(getSignature()[1]);
    }

    /**
     * Get an animation transform.
     * @param part     The MOFPart to apply to.
     * @param actionId The animation to get the transform for.
     * @param frame    The frame id to get the transform for.
     * @return transform
     */
    public TransformObject getTransform(MOFPart part, int actionId, int frame) {
        return getCommonData().getTransforms().get(getAnimationById(actionId).getTransformID(frame, part));
    }

    /**
     * Gets the MOFAnimation cel by its action id.
     * @param actionId The given action.
     * @return cel
     */
    public MOFAnimationCels getAnimationById(int actionId) {
        return getModelSet().getCelSet().getCels().get(actionId);
    }

    /**
     * Gets the amount of actions this MOFAnimation has.
     * @return actionCount
     */
    public int getAnimationCount() {
        return getModelSet().getCelSet().getCels().size();
    }

    /**
     * Generate a bounding box for this model.
     * This is slightly inaccurate, but only by a little, there was likely some information lost when the original models were converted to MOF.
     * @return boundingBox
     */
    public MOFBBox makeBoundingBox() {
        float minX = Float.MAX_VALUE;
        float minY = Float.MAX_VALUE;
        float minZ = Float.MAX_VALUE;
        float maxX = Float.MIN_VALUE;
        float maxY = Float.MIN_VALUE;
        float maxZ = Float.MIN_VALUE;

        float testX = Float.MAX_VALUE;
        float testY = Float.MAX_VALUE;
        float testZ = Float.MAX_VALUE;

        for (MOFPart part : getStaticMOF().getParts()) {
            for (int action = 0; action < getHolder().getMaxAnimation(); action++) {
                for (int frame = 0; frame < getHolder().getMaxFrame(action); frame++) {
                    MOFPartcel partcel = part.getCel(action, frame);
                    TransformObject transform = getTransform(part, action, frame);

                    for (SVector sVec : partcel.getVertices()) {
                        IVector vertex = PSXMatrix.MRApplyMatrix(transform.calculatePartTransform(), sVec, new IVector());

                        minX = Math.min(minX, vertex.getFloatX());
                        minY = Math.min(minY, vertex.getFloatY());
                        minZ = Math.min(minZ, vertex.getFloatZ());
                        maxX = Math.max(maxX, vertex.getFloatX());
                        maxY = Math.max(maxY, vertex.getFloatY());
                        maxZ = Math.max(maxZ, vertex.getFloatZ());
                        if (Math.abs(vertex.getFloatX()) < Math.abs(testX))
                            testX = vertex.getFloatX();
                        if (Math.abs(vertex.getFloatY()) < Math.abs(testY))
                            testY = vertex.getFloatY();
                        if (Math.abs(vertex.getFloatZ()) < Math.abs(testZ))
                            testZ = vertex.getFloatZ();
                    }
                }
            }
        }

        MOFBBox box = new MOFBBox();
        box.getVertices()[0].setValues(minX, minY, minZ, 4);
        box.getVertices()[1].setValues(minX, minY, maxZ, 4);
        box.getVertices()[2].setValues(minX, maxY, minZ, 4);
        box.getVertices()[3].setValues(minX, maxY, maxZ, 4);
        box.getVertices()[4].setValues(maxX, minY, minZ, 4);
        box.getVertices()[5].setValues(maxX, minY, maxZ, 4);
        box.getVertices()[6].setValues(maxX, maxY, minZ, 4);
        box.getVertices()[7].setValues(maxX, maxY, maxZ, 4);
        return box;
    }
}
