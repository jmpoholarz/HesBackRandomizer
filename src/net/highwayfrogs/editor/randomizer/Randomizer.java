package net.highwayfrogs.editor.randomizer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.highwayfrogs.editor.file.GameFile;
import net.highwayfrogs.editor.file.MWDFile;
import net.highwayfrogs.editor.file.MWIFile;
import net.highwayfrogs.editor.file.config.data.MAPLevel;
import net.highwayfrogs.editor.file.config.exe.LevelInfo;
import net.highwayfrogs.editor.file.map.MAPFile;
import net.highwayfrogs.editor.file.map.entity.Entity;
import net.highwayfrogs.editor.file.map.entity.data.EntityData;
import net.highwayfrogs.editor.file.map.entity.data.MatrixData;
import net.highwayfrogs.editor.file.map.entity.data.general.CheckpointEntity;
import net.highwayfrogs.editor.file.standard.psx.PSXMatrix;
import net.highwayfrogs.editor.gui.GUIMain;
import net.highwayfrogs.editor.gui.MainController;
import net.highwayfrogs.editor.gui.editor.SaveController;
import net.highwayfrogs.editor.utils.Utils;
import sun.applet.Main;

import java.util.*;

public class Randomizer {
    /*
     * The main class for Randomizing Frogger He's Back
     */

    public void randomize() {

        // Get MWD file loaded by GUI launch
        MWDFile mwdFile = MainController.MAIN_WINDOW.getMwdFile();

        // List to hold all of the map files to randomize
        ObservableList<GameFile> mapFiles = FXCollections.observableArrayList();

        // Iterate through all game files looking for MAP files
        for (GameFile gameFile : mwdFile.getFiles()) {
            MWIFile.FileEntry fileEntry = mwdFile.getEntryMap().get(gameFile);
            // Add the file to the maps if it has a MAP file type ID
            if (fileEntry.getSpoofedTypeId() == MAPFile.TYPE_ID
                    && MapData.VALID_MAPS.contains(fileEntry.getDisplayName())) {

                //MAPFile mapFile = (MAPFile) gameFile;

                System.out.println(fileEntry.getDisplayName());

                /*MAPLevel level = MAPLevel.getByName(mapFile.getFileEntry().getDisplayName());
                if (level != null) {
                    mapFile.getConfig().getLevelImageMap().computeIfAbsent(level, key -> {
                        if (mapFile.getConfig().getLevelInfoMap().isEmpty())
                            return null;

                        LevelInfo info = mapFile.getConfig().getLevelInfoMap().get(key);
                        if (info != null)
                            return Utils.toFXImage(Utils.resizeImage(mapFile.getConfig().getImageFromPointer(info.getLevelTexturePointer()).toBufferedImage(), 35, 35), false);
                        return null;
                    });
                }*/







                mapFiles.add(gameFile);
            }
        }


        Random random = new Random();

        for (GameFile gf : mapFiles) {
            MAPFile mf = (MAPFile) gf;

            // Get data to randomize for the given map
            String mapName = mwdFile.getEntryMap().get(mf).getDisplayName();
            ArrayList<FrogPosition> frogPositions = MapData.FROG_LOCATIONS.get(mapName);
            ArrayList<StartPosition> startPositions = MapData.START_LOCATIONS.get(mapName);

            // Skip map if no data to randomize
            if (frogPositions == null || startPositions == null) {
                continue;
            }

            // Randomize start location
            StartPosition startPos = startPositions.get(random.nextInt(startPositions.size()));
            mf.setStartXTile(startPos.x);
            mf.setStartZTile(startPos.z);
            mf.setStartRotation(startPos.rotation);
            //mf.

            // Remove same zone frogs from frogPositions
            frogPositions.removeIf(frog -> frog.zone == startPos.zone);

            // Randomize frog locations by moving the entities
            List<Entity> entities = mf.getEntities();
            // Iterate through entities to find the frogs
            for (Entity entity : entities) {
                if (entity.getEntityData() instanceof CheckpointEntity) {
                    MatrixData data = (MatrixData) entity.getEntityData();

                    // Select a random available position and update the frog
                    FrogPosition frogPos = frogPositions.get(random.nextInt(frogPositions.size()));
                    frogPositions.remove(frogPos); // Remove so no duplicate positions chosen

                    // Update the position of the Entity
                    PSXMatrix psxMaxtrix = data.getMatrix();
                    psxMaxtrix.setTransform(new int[] {
                            Utils.floatToFixedPointInt4Bit(frogPos.x),
                            Utils.floatToFixedPointInt4Bit(frogPos.y),
                            Utils.floatToFixedPointInt4Bit(frogPos.z)
                    });
                    psxMaxtrix.updateMatrix(
                            frogPos.yaw * Math.PI / 180.0,
                            frogPos.pitch * Math.PI / 180.0,
                            frogPos.roll * Math.PI / 180.0
                    );


                }
            }
        }



        // Save the end result
        //SaveController.saveFiles(GUIMain.EXE_CONFIG, MainController.MAIN_WINDOW.getMwdFile());
    }
}
