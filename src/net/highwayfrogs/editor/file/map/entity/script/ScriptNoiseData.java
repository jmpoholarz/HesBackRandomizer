package net.highwayfrogs.editor.file.map.entity.script;

import lombok.Getter;
import lombok.Setter;
import net.highwayfrogs.editor.file.reader.DataReader;
import net.highwayfrogs.editor.file.writer.DataWriter;
import net.highwayfrogs.editor.gui.GUIEditorGrid;

/**
 * Loads and saves sound radius data.
 * Created by Kneesnap on 11/27/2018.
 */
@Getter
@Setter
public class ScriptNoiseData extends EntityScriptData {
    private int minRadius;
    private int maxRadius;

    @Override
    public void load(DataReader reader) {
        this.minRadius = reader.readInt();
        this.maxRadius = reader.readInt();
    }

    @Override
    public void save(DataWriter writer) {
        writer.writeInt(this.minRadius);
        writer.writeInt(this.maxRadius);
    }

    @Override
    public void addData(GUIEditorGrid editor) {
        editor.addIntegerField("Min Radius", getMinRadius(), this::setMinRadius, null);
        editor.addIntegerField("Max Radius", getMaxRadius(), this::setMaxRadius, null);
    }
}
