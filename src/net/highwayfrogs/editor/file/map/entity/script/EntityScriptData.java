package net.highwayfrogs.editor.file.map.entity.script;

import javafx.scene.control.TableView;
import net.highwayfrogs.editor.file.GameObject;
import net.highwayfrogs.editor.system.NameValuePair;

/**
 * Listens to entity script data.
 * Created by Kneesnap on 11/27/2018.
 */
public abstract class EntityScriptData extends GameObject {

    /**
     * Add script data.
     * @param table The table to add data to.
     */
    public abstract void addData(TableView<NameValuePair> table);
}
