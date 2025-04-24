package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.standard.psx.ByteUV;

/**
 * A location where one of the baby frogs / froglets may be placed in a level that Frogger will need to find in order
 * to beat the given level.
 */
public class FrogPosition {

    /**
     * The name assigned to this position, unique from all other froglets in the game.  Typically, in the form of
     * {LEVEL_NAME}_{ZONE}{NUMBER}.  For example, "SUB1_A2".
     */
    public String id;

    /**
     * Left-right grid position
     */
    public float x;

    /**
     * Vertical position on the map
     */
    public float y;

    /**
     * Forward-back grid position
     */
    public float z;

    /**
     * Rotation about the Z axis
     */
    public float yaw;

    /**
     * Rotation about the Y axis
     */
    public float pitch;

    /**
     * Rotation about the X axis
     */
    public float roll;

    /**
     * Area of the map for this position; mutually exclusive with Frogger start.  In reference images, A corresponds
     * to zone 0, B to 1, and so on.
     */
    public int zone;

    /**
     * X tile in the map of the frog
     */
    public int tileX;

    /**
     * Z tile in the map of the frog
     */
    public int tileZ;

    /**
     * Which index in the stack of tiles at that location to change the graphics for, used in the case where there
     * are multiple tiles at the same X and Z that overlap each other vertically.
     */
    public int stackIndex;

    /**
     * Texture that holds the ring graphic
     */
    public int ringTextureIndex;

    /**
     * Index of the tile when not the frog ring tile
     */
    public int defaultTextureIndex;

    /**
     * UVs for the tile texture
     */
    public ByteUV[] UVs;

    FrogPosition(String id, double x, double y, double z, double yaw, double pitch, double roll, int zone) {
        this(id, x, y, z, yaw, pitch, roll, zone, -1, -1, 0, -1, -1, null);
    }

    FrogPosition(String id, double x, double y, double z, double yaw, double pitch, double roll, int zone,
                 int tileX, int tileZ, int stackIndex,
                 int defaultTextureIndex, int ringTextureIndex, ByteUV[] UVs) {
        this.id = id;
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
        this.roll = (float) roll;
        this.zone = zone;
        this.tileX = tileX;
        this.tileZ = tileZ;
        this.stackIndex = stackIndex;
        this.defaultTextureIndex = defaultTextureIndex;
        this.ringTextureIndex = ringTextureIndex;
        this.UVs = UVs;
    }

}
