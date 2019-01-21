package net.highwayfrogs.editor.file.map.entity.data.jungle;

import javafx.scene.control.TableView;
import lombok.Getter;
import net.highwayfrogs.editor.file.map.entity.data.MatrixData;
import net.highwayfrogs.editor.file.reader.DataReader;
import net.highwayfrogs.editor.file.writer.DataWriter;
import net.highwayfrogs.editor.system.NameValuePair;

/**
 * Represents "JUN_OUTRO_FROGPLINTH_DATA".
 * Created by Kneesnap on 11/26/2018.
 */
@Getter
public class EntityOutroPlinth extends MatrixData {
    private int id;

    @Override
    public void load(DataReader reader) {
        super.load(reader);
        this.id = reader.readInt();
    }

    @Override
    public void save(DataWriter writer) {
        super.save(writer);
        writer.writeInt(this.id);
    }

    @Override
    public void addData(TableView<NameValuePair> table) {
        super.addData(table);
        table.getItems().add(new NameValuePair("ID", String.valueOf(getId())));
    }
}
