package net.highwayfrogs.editor.file;

import net.highwayfrogs.editor.file.config.FroggerEXEInfo;
import net.highwayfrogs.editor.file.reader.DataReader;
import net.highwayfrogs.editor.file.writer.DataWriter;
import net.highwayfrogs.editor.gui.GUIMain;

/**
 * This represents a single game-file, which can be turned into a byte array.
 * Created by Kneesnap on 8/10/2018.
 */
public abstract class GameObject {

    /**
     * Loads information from the file into this object.
     * @param reader The reader to load information from.
     */
    public abstract void load(DataReader reader);

    /**
     * Saves information from the instance into a DataWriter.
     * @param writer The writer to save information into.
     */
    public abstract void save(DataWriter writer);

    /**
     * Get the exe config.
     * @return exeConfig
     */
    public FroggerEXEInfo getConfig() {
        return GUIMain.EXE_CONFIG;
    }

    /**
     * Get the parent MWD file.
     * @return mwdFile
     */
    public MWDFile getMWD() {
        return getConfig().getMWD();
    }
}
