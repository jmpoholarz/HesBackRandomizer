package net.highwayfrogs.editor.randomizer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.highwayfrogs.editor.file.GameFile;
import net.highwayfrogs.editor.file.MWDFile;
import net.highwayfrogs.editor.file.MWIFile;
import net.highwayfrogs.editor.file.config.FroggerEXEInfo;
import net.highwayfrogs.editor.file.config.LevelShuffler;
import net.highwayfrogs.editor.file.config.data.MAPLevel;
import net.highwayfrogs.editor.file.config.exe.LevelInfo;
import net.highwayfrogs.editor.file.map.MAPFile;
import net.highwayfrogs.editor.file.map.animation.MAPAnimation;
import net.highwayfrogs.editor.file.map.animation.MAPUVInfo;
import net.highwayfrogs.editor.file.map.entity.Entity;
import net.highwayfrogs.editor.file.map.entity.data.EntityData;
import net.highwayfrogs.editor.file.map.entity.data.MatrixData;
import net.highwayfrogs.editor.file.map.entity.data.general.CheckpointEntity;
import net.highwayfrogs.editor.file.map.grid.GridSquare;
import net.highwayfrogs.editor.file.map.grid.GridStack;
import net.highwayfrogs.editor.file.map.path.Path;
import net.highwayfrogs.editor.file.map.poly.polygon.MAPPolyGT4;
import net.highwayfrogs.editor.file.map.poly.polygon.MAPPolyTexture;
import net.highwayfrogs.editor.file.map.poly.polygon.MAPPolygon;
import net.highwayfrogs.editor.file.standard.SVector;
import net.highwayfrogs.editor.file.standard.psx.ByteUV;
import net.highwayfrogs.editor.file.standard.psx.PSXMatrix;
import net.highwayfrogs.editor.gui.GUIMain;
import net.highwayfrogs.editor.gui.MainController;
import net.highwayfrogs.editor.gui.editor.SaveController;
import net.highwayfrogs.editor.utils.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Randomizer {
    /*
     * The main class for Randomizing Frogger He's Back
     */

    String[] launchArgs;
    long randomizerSeed = -1;
    boolean randomizeZoneOrder = false;
    boolean randomizeLevelOrder = true;
    boolean randomizeLevelsAcrossZones = false;

    public void setLaunchArgs(String[] launchArgs) {
        this.launchArgs = launchArgs;
        for (String s : launchArgs) {
            System.out.println(s);
        }
    }

    public void parseLaunchArgs() {
        for (String s : launchArgs) {
            if (s.startsWith("--seed=")) {
                randomizerSeed = Long.parseLong(s.substring(7));
            }
//            else if (s.startsWith("--randZones=")) {
//                randomizeZoneOrder = (s.substring(12).equalsIgnoreCase("true"));
//            }
//            else if (s.startsWith("--randLevels=")) {
//                randomizeLevelOrder = (s.substring(13).equalsIgnoreCase("true"));
//            }
        }
    }


    public void randomize(FroggerEXEInfo exeFile) {
        parseLaunchArgs();

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

        // Init random number generator using provided seed if available
        Random random;
        if (randomizerSeed != -1) {
            random = new Random(randomizerSeed);
        }
        else {
            random = new Random();
            randomizerSeed = random.nextInt(Integer.MAX_VALUE);
            random.setSeed(randomizerSeed);
        }


        /* Randomize Level Order */
        //List<MAPLevel> levelList = new ArrayList<>();

        HashMap<Integer, ArrayList<LevelInfo>> levelInfoHashMap = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            levelInfoHashMap.put(i, new ArrayList<>());
        }


        for (LevelInfo info : exeFile.getAllLevelInfo()) {
            System.out.println(info.toString());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        //LevelShuffler levelShuffler = new LevelShuffler(exeFile.getAllLevelInfo(), random);
        //levelShuffler.removeNonSingleplayerLevels();

//        if (randomizeLevelOrder) {
//            levelShuffler.shuffleLevelsInWorlds();
//        }


        List<LevelInfo> levels = exeFile.getAllLevelInfo();
        //LevelInfo A = levels.get(5); //LILY1
        //LevelInfo B = levels.get(6); //LILY2
        //A.setLevel(49);
        //A.setWorld(); ?
        //A.setStackPosition(2);
        //A.setTheme(); ?
        //A.setLocalLevelId(1);
        //A.setLevelsInWorld(2);
        //A.setWorldImageSelectablePointer(4785856);
        //A.setWorldImageVisitedPointer(4797760);
        //A.setWorldImageNotTriedPointer(4797760);
        //A.setLevelTexturePointer(4783888);
        //A.setLevelNameTexturePointer(4795536);
        //A.setLevelNameTextureInGamePointer(4795536);

        //B.setLevel(48);
        //B.setWorld(); ?
        //B.setStackPosition(1);
        //B.setTheme(); ?
        //B.setLocalLevelId(0);
        //B.setLevelsInWorld(5);
        //B.setWorldImageSelectablePointer(4788064);
        //B.setWorldImageVisitedPointer(4794480);
        //B.setWorldImageNotTriedPointer(4794480);
        //B.setLevelTexturePointer(4800256);
        //B.setLevelNameTexturePointer(4796592);
        //B.setLevelNameTextureInGamePointer(4796592);*/


        for (LevelInfo info : exeFile.getAllLevelInfo()) {
            //if (info.getLevel() != null) {
            //    levelList.add(info.getLevel());
            //}
            System.out.println(info.toString());

            //levelInfoHashMap.get(info.getStackPosition()).add(info);
            //info.save();

        }




        /* Randomize Maps */
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


            // Remove all Frog Circle markers
            for (FrogPosition frogPos : frogPositions) {
                if (frogPos.tileX == -1 || frogPos.tileZ == -1
                        || frogPos.defaultTextureIndex == -1) {
                    continue;
                }
                GridStack gs = mf.getGridStack(frogPos.tileX, frogPos.tileZ);
                MAPPolyTexture poly = (MAPPolyTexture) gs.getGridSquares()
                        .get(frogPos.stackIndex).getPolygon();

                if (poly.getTextureId() != frogPos.defaultTextureIndex) {
                    System.out.println("Reset texture in " + mapName + " at " +
                            frogPos.tileX + "," + frogPos.tileZ + " from " + poly.getTextureId()
                            + " to " + frogPos.defaultTextureIndex);

                    poly.setTextureId((short) frogPos.defaultTextureIndex);
                }
            }


            // Randomize start location
            StartPosition startPos = startPositions.get(random.nextInt(startPositions.size()));
            mf.setStartXTile(startPos.x);
            mf.setStartZTile(startPos.z);
            mf.setStartRotation(startPos.rotation);

            // Remove all start Target markers except for the selected
            for (StartPosition startOpt : startPositions) {
                if (startOpt.x == -1 || startOpt.z == -1 || startOpt.ringTextureIndex == -1) {
                    continue;
                }

                for (GridStack gs : mf.getGridStacks()) {
                    // Find optional start tile in tiles
                    if (mf.getGridX(gs) != startOpt.x || mf.getGridZ(gs) != startOpt.z) {
                        continue;
                    }
                    if (startPos.x == startOpt.x && startPos.z == startOpt.z) {
                        // If the optional start tile was actually selected as the start
                        // Add the target on that tile if supported
                        if (startOpt.ringTextureIndex != -1) {

                            MAPPolyTexture poly = (MAPPolyTexture) gs.getGridSquares().get(0).getPolygon();

                            System.out.println("Changed start texture in " + mapName + " at " +
                                    startOpt.x + "," + startOpt.z + " from " + poly.getTextureId() +
                                    " to " + startOpt.ringTextureIndex);

                            poly.setTextureId((short) startOpt.ringTextureIndex);

                            // Remove animation from the tile if there is one
                            for (MAPAnimation ma : mf.getMapAnimations()) {
                                List<MAPUVInfo> uvs = ma.getMapUVs();
                                uvs.removeIf(uv -> {
                                    boolean ret = verticesMatch(uv.getPolygon().getVertices(), poly.getVertices());
                                    //if (ret) System.out.println("Was true");
                                    return ret;
                                });
                            }
                            // Set Tile UVs if provided
                            if (startPos.UVs != null) {
                                poly.setUvs(startPos.UVs);
                            }
                        }
                    }
                    else {
                        // If the optional start tile was not selected
                        // Find all polygons with a matching vertex with the target graphic
                        MAPPolyTexture poly = (MAPPolyTexture) gs.getGridSquares().get(0).getPolygon();

                        ArrayList<int[]> targetMarkedPolys = new ArrayList<>();
                        targetMarkedPolys.add(poly.getVertices()); // polys which had target graphic
                        List<MAPPolygon> polysToCheck = mf.getAllPolygons();
                        for (int i = 0; i < polysToCheck.size(); i++) {
                            MAPPolygon mp = polysToCheck.get(i);
                            try {
                                MAPPolyTexture mpt = (MAPPolyTexture) mp;
                                if (mpt.getTextureId() == startOpt.ringTextureIndex
                                        && startOpt.defaultTextureIndex != -1) {
                                    for (int[] entry : targetMarkedPolys) {
                                        if (verticesIntersect(entry, mpt.getVertices())) {
                                            // Set them to the default texture
                                            mpt.setTextureId((short) startOpt.defaultTextureIndex);
                                            /*
                                             * Add the poly just changed to the list of polys to
                                             * check because another poly with the target graphic
                                             * may share a vertex with one of them but not the
                                             * main poly from the original tile provided
                                             */
                                            targetMarkedPolys.add(mpt.getVertices());
                                            // Remove it from the list to prevent an infinite loop
                                            polysToCheck.remove(i);
                                            // Restart at the beginning of the list of polys in
                                            // case any were missed initially
                                            i = -1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception ignored) {}
                        }
                    }
                }
            }


            // Remove same zone frogs from frogPositions
            frogPositions.removeIf(frog -> frog.zone == startPos.zone);

            // Remove banned zone frogs from frogPositions
            frogPositions.removeIf(frog -> startPos.bannedFrogZones.contains(frog.zone));

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

                    // Add new frog circles on tiles that support them
                    if (frogPos.tileX != -1 && frogPos.tileZ != -1
                            && frogPos.ringTextureIndex != -1) {
                        GridStack gs = mf.getGridStack(frogPos.tileX, frogPos.tileZ);
                        MAPPolyTexture poly = (MAPPolyTexture) gs.getGridSquares()
                                .get(frogPos.stackIndex).getPolygon();

                        System.out.println("Changed texture in " + mapName + " at " +
                                frogPos.tileX + "," + frogPos.tileZ + " from " +
                                poly.getTextureId() + " to " + frogPos.ringTextureIndex);

                        poly.setTextureId((short) frogPos.ringTextureIndex);

                        // Remove animation from the tile if there is one
                        for (MAPAnimation ma : mf.getMapAnimations()) {
                            List<MAPUVInfo> uvs = ma.getMapUVs();
                            uvs.removeIf(uv -> {
                                boolean ret = verticesMatch(uv.getPolygon().getVertices(), poly.getVertices());
                                //if (ret) System.out.println("Was true");
                                return ret;
                            });
                        }
                        // Set Tile UVs if provided
                        if (frogPos.UVs != null) {
                            poly.setUvs(frogPos.UVs);
                        }

                    }


                }
            }

            // Randomize lanes in Retro levels
            if (mapName.contains("ORG")) {
                RetroLaneShuffler rls = new RetroLaneShuffler(random);
                rls.shuffleLanes(mapName, mf);
            }

        }



        // Save the end result
        SaveController.saveFiles(GUIMain.EXE_CONFIG, MainController.MAIN_WINDOW.getMwdFile());
        try {
            FileWriter writer = new FileWriter(new File(
                    GUIMain.EXE_CONFIG.getFolder(), "seed.txt"));
            writer.write("Seed: " + randomizerSeed);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to write seed to file. Error: ");
            e.printStackTrace();
        }
        System.exit(0);
    }


    /**
     * Given two arrays of vertex IDs, check if all the IDs between the two arrays match.  Order
     * may differ between a and b.
     * @param aa first array of vertices
     * @param bb second array of vertices
     * @return true if all elements in a match all elements in b
     */
    boolean verticesMatch(int[] aa, int[] bb) {
        // Copy arrays since the original is pass by reference and we're going to overwrite values
        int[] a = Arrays.copyOf(aa, aa.length);
        int[] b = Arrays.copyOf(bb, bb.length);
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            boolean isInB = false;
            for (int j = 0; j < b. length; j++) {
                if (b[j] == a[i]) {
                    isInB = true;
                    a[i] = -1 * i;
                    b[j] = -1 * j;
                }
            }
            if (!isInB)
                return false;
        }
        return true;
    }

    /**
     * Given two arrays of vertex IDs, check if any of the IDs between thw two arrays match
     * @param a first array of vertices
     * @param b second array of vertices
     * @return true if any element of a matches any element of b
     */
    boolean verticesIntersect(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
