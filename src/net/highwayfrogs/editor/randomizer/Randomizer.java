package net.highwayfrogs.editor.randomizer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.highwayfrogs.editor.file.standard.psx.ByteUV;
import net.highwayfrogs.editor.file.standard.psx.PSXMatrix;
import net.highwayfrogs.editor.games.sony.SCGameFile;
import net.highwayfrogs.editor.games.sony.frogger.FroggerGameInstance;
import net.highwayfrogs.editor.games.sony.frogger.map.FroggerMapFile;
import net.highwayfrogs.editor.games.sony.frogger.map.data.animation.FroggerMapAnimation;
import net.highwayfrogs.editor.games.sony.frogger.map.data.animation.FroggerMapAnimationTargetPolygon;
import net.highwayfrogs.editor.games.sony.frogger.map.data.entity.FroggerMapEntity;
import net.highwayfrogs.editor.games.sony.frogger.map.data.entity.data.FroggerEntityDataMatrix;
import net.highwayfrogs.editor.games.sony.frogger.map.data.entity.data.general.FroggerEntityDataCheckpoint;
import net.highwayfrogs.editor.games.sony.frogger.map.data.grid.FroggerGridStack;
import net.highwayfrogs.editor.games.sony.frogger.map.mesh.FroggerMapPolygon;
import net.highwayfrogs.editor.games.sony.shared.SCByteTextureUV;
import net.highwayfrogs.editor.games.sony.shared.mwd.MWDFile;
import net.highwayfrogs.editor.games.sony.shared.mwd.mwi.MWIResourceEntry;
import net.highwayfrogs.editor.utils.DataUtils;

import java.util.*;

import static net.highwayfrogs.editor.games.sony.frogger.FroggerGameInstance.FILE_TYPE_ANY;
import static net.highwayfrogs.editor.randomizer.Utils.verticesIntersect;
import static net.highwayfrogs.editor.randomizer.Utils.verticesMatch;

/**
 * The main class for randomizing Frogger: He's Back.
 */
public class Randomizer {

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
            if (s.startsWith("--seed=") && s.length() > 7) {
                randomizerSeed = Long.parseLong(s.substring(7));
                RandomizerConfig.seed = randomizerSeed;
            }
//            else if (s.startsWith("--randZones=")) {
//                randomizeZoneOrder = (s.substring(12).equalsIgnoreCase("true"));
//            }
//            else if (s.startsWith("--randLevels=")) {
//                randomizeLevelOrder = (s.substring(13).equalsIgnoreCase("true"));
//            }
        }
    }

    public Random loadRandomNumberGenerator() {
        Random random;
        if (randomizerSeed != -1) {
            random = new Random(randomizerSeed);
        }
        else {
            random = new Random();
            randomizerSeed = random.nextInt(Integer.MAX_VALUE);
            random.setSeed(randomizerSeed);
        }
        return random;
    }


    public ObservableList<SCGameFile<FroggerGameInstance>> getMapFiles(FroggerGameInstance gameInstance, MWDFile mwdFile) {
        ObservableList<SCGameFile<FroggerGameInstance>> mapFiles = FXCollections.observableArrayList();

        // Iterate through all game files looking for MAP files
        for (SCGameFile<?> gameFile : mwdFile.getFiles()) {

            if (!(gameFile instanceof FroggerMapFile)) {
                continue;
            }

            FroggerMapFile mapFile = (FroggerMapFile) gameFile;
            MWIResourceEntry resourceEntry = (MWIResourceEntry) mapFile.getFileDefinition();

            if (resourceEntry.getTypeId() != FILE_TYPE_ANY) {
                continue;
            }
            if (!resourceEntry.hasExtension("map")) {
                continue;
            }
            if (!MapData.VALID_MAPS.contains(gameFile.getFileDisplayName())) {
                continue;
            }

            mapFiles.add(mapFile);
            System.out.println(gameFile.getFileDisplayName());
        }

        System.out.println("Done fetching maps");

        return mapFiles;
    }


    public void randomize(FroggerGameInstance gameInstance) {
        //parseLaunchArgs();

        MWDFile mwdFile = gameInstance.mainArchive;

        // List to hold all of the map files to randomize
        ObservableList<SCGameFile<FroggerGameInstance>> mapFiles = getMapFiles(gameInstance, mwdFile);

        // Init random number generator using provided seed if available
        Random random = loadRandomNumberGenerator();

        randomizeMaps(mapFiles, mwdFile, random);
    }

    public void randomizeLevelOrder() {
//        /* Randomize Level Order */
//        //List<MAPLevel> levelList = new ArrayList<>();
//
//        HashMap<Integer, ArrayList<LevelInfo>> levelInfoHashMap = new HashMap<>();
//        for (int i = 0; i < 8; i++) {
//            levelInfoHashMap.put(i, new ArrayList<>());
//        }
//
//        for (LevelInfo info : exeFile.getAllLevelInfo()) {
//            System.out.println(info.toString());
//        }
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~");
//
//        //LevelShuffler levelShuffler = new LevelShuffler(exeFile.getAllLevelInfo(), random);
//        //levelShuffler.removeNonSingleplayerLevels();
//
////        if (randomizeLevelOrder) {
////            levelShuffler.shuffleLevelsInWorlds();
////        }
//
//
//        List<LevelInfo> levels = exeFile.getAllLevelInfo();
//        //LevelInfo A = levels.get(5); //LILY1
//        //LevelInfo B = levels.get(6); //LILY2
//        //A.setLevel(49);
//        //A.setWorld(); ?
//        //A.setStackPosition(2);
//        //A.setTheme(); ?
//        //A.setLocalLevelId(1);
//        //A.setLevelsInWorld(2);
//        //A.setWorldImageSelectablePointer(4785856);
//        //A.setWorldImageVisitedPointer(4797760);
//        //A.setWorldImageNotTriedPointer(4797760);
//        //A.setLevelTexturePointer(4783888);
//        //A.setLevelNameTexturePointer(4795536);
//        //A.setLevelNameTextureInGamePointer(4795536);
//
//        //B.setLevel(48);
//        //B.setWorld(); ?
//        //B.setStackPosition(1);
//        //B.setTheme(); ?
//        //B.setLocalLevelId(0);
//        //B.setLevelsInWorld(5);
//        //B.setWorldImageSelectablePointer(4788064);
//        //B.setWorldImageVisitedPointer(4794480);
//        //B.setWorldImageNotTriedPointer(4794480);
//        //B.setLevelTexturePointer(4800256);
//        //B.setLevelNameTexturePointer(4796592);
//        //B.setLevelNameTextureInGamePointer(4796592);*/
//
//
//        for (LevelInfo info : exeFile.getAllLevelInfo()) {
//            //if (info.getLevel() != null) {
//            //    levelList.add(info.getLevel());
//            //}
//            System.out.println(info.toString());
//
//            //levelInfoHashMap.get(info.getStackPosition()).add(info);
//            //info.save();
//
//        }
    }


    public void randomizeMaps(ObservableList<SCGameFile<FroggerGameInstance>> mapFiles, MWDFile mwdFile, Random random) {
        /* Randomize Maps */
        for (SCGameFile<FroggerGameInstance> gameFile : mapFiles) {
            FroggerMapFile mapFile = (FroggerMapFile) gameFile;

            // Get data to randomize for the given map
            String mapName = mapFile.getFileDisplayName();
            ArrayList<FrogPosition> frogPositions = MapData.FROG_LOCATIONS.get(mapName);
            ArrayList<StartPosition> startPositions = MapData.START_LOCATIONS.get(mapName);

            // Skip map if no data to randomize
            if (frogPositions == null || startPositions == null) {
                continue;
            }

            removeFrogletRings(mapFile, frogPositions);

            // Randomize start location
            StartPosition startPos = startPositions.get(random.nextInt(startPositions.size()));

            mapFile.getGeneralPacket().setStartGridCoordX(startPos.x);
            mapFile.getGeneralPacket().setStartGridCoordZ(startPos.z);
            //mapFile.getGeneralPacket().setStartingTimeLimit(); TODO dynamic times based on start location, esp. for PSX which is more strict on the time limit
            mapFile.getGeneralPacket().setStartRotation(startPos.rotation);

            removeFroggerTargets(mapFile, startPositions, startPos);

            // Remove all frogs that are forbidden from this startPosition
            frogPositions.removeIf(frogletPos -> startPos.bannedFroglets.contains(frogletPos.id));

            randomizeFrogletPositions(mapFile, frogPositions, random);

            // Randomize lanes in Retro levels
            if (mapName.contains("ORG")) {
                RetroLaneShuffler rls = new RetroLaneShuffler(random);
                rls.shuffleLanes(mapName, mapFile);
            }
        }
    }


    public void randomizeFrogletPositions(FroggerMapFile mapFile, ArrayList<FrogPosition> frogPositions, Random random) {
        // Randomize frog locations by moving the entities
        List<FroggerMapEntity> entities = mapFile.getEntityPacket().getEntities();
        // Iterate through entities to find the frogs
        for (FroggerMapEntity entity : entities) {
            if (entity.getEntityData() instanceof FroggerEntityDataCheckpoint) {
                FroggerEntityDataMatrix data = (FroggerEntityDataMatrix) entity.getEntityData();

                // Select a random available position and update the frog
                FrogPosition frogPos = frogPositions.get(random.nextInt(frogPositions.size()));
                frogPositions.remove(frogPos); // Remove so no duplicate positions chosen

                // Update the position of the Entity
                PSXMatrix psxMatrix = data.getMatrix();
                psxMatrix.setTransform(new int[] {
                        DataUtils.floatToFixedPointInt4Bit(frogPos.x),
                        DataUtils.floatToFixedPointInt4Bit(frogPos.y),
                        DataUtils.floatToFixedPointInt4Bit(frogPos.z)
                });
                psxMatrix.updateMatrix(
                        frogPos.yaw * Math.PI / 180.0,
                        frogPos.pitch * Math.PI / 180.0,
                        frogPos.roll * Math.PI / 180.0
                );

                // Add new frog circles on tiles that support them
                if (frogPos.tileX != -1 && frogPos.tileZ != -1
                        && frogPos.ringTextureIndex != -1) {

                    FroggerGridStack gridStack = mapFile.getGridPacket().getGridStack(frogPos.tileX, frogPos.tileZ);
                    FroggerMapPolygon poly = gridStack.getGridSquares().get(frogPos.stackIndex).getPolygon();

                    System.out.println("Changed texture in " + mapFile.getFileDisplayName() + " at " +
                            frogPos.tileX + "," + frogPos.tileZ + " from " +
                            poly.getTextureId() + " to " + frogPos.ringTextureIndex);

                    poly.setTextureId((short) frogPos.ringTextureIndex);

                    // Remove animation from the tile if there is one
                    for (FroggerMapAnimation mapAnimation : mapFile.getAnimationPacket().getAnimations()) {
                        List<FroggerMapAnimationTargetPolygon> uvs = mapAnimation.getTargetPolygons();
                        uvs.removeIf(uv -> {
                            boolean ret = verticesMatch(uv.getPolygon().getVertices(), poly.getVertices());
                            //if (ret) System.out.println("Was true");
                            return ret;
                        });
                    }
                    // Set Tile UVs if provided
                    if (frogPos.UVs != null) {
                        // Could probably change the UVs to SCByteTextureUV instead but let's try this first
                        SCByteTextureUV[] textureUVs = new SCByteTextureUV[frogPos.UVs.length];
                        // UV order was swapped, so workaround switch 3rd and 4th
                        ByteUV temp = frogPos.UVs[2];
                        frogPos.UVs[2] = frogPos.UVs[3];
                        frogPos.UVs[3] = temp;
                        for (int i = 0; i < frogPos.UVs.length; i++) {
                            textureUVs[i] = new SCByteTextureUV(frogPos.UVs[i].getU(), frogPos.UVs[i].getV());
                        }
                        poly.setTextureUvs(textureUVs);
                        System.out.println("Setting UVs in " + mapFile.getFileDisplayName() + " at " +
                                frogPos.tileX + "," + frogPos.tileZ);
                    }
                }
            }
        }
    }

    public void removeFrogletRings(FroggerMapFile mapFile, ArrayList<FrogPosition> frogPositions) {
        // Remove all Frog Circle markers
        for (FrogPosition frogPos : frogPositions) {
            if (frogPos.tileX == -1 || frogPos.tileZ == -1
                    || frogPos.defaultTextureIndex == -1) {
                continue;
            }
            FroggerGridStack gridStack = mapFile.getGridPacket().getGridStack(frogPos.tileX, frogPos.tileZ);
            FroggerMapPolygon poly = gridStack.getGridSquares().get(frogPos.stackIndex).getPolygon();

            if (poly.getTextureId() != frogPos.defaultTextureIndex) {
                System.out.println("Reset texture in " + mapFile.getFileDisplayName() + " at " +
                        frogPos.tileX + "," + frogPos.tileZ + " from " + poly.getTextureId()
                        + " to " + frogPos.defaultTextureIndex);

                poly.setTextureId((short) frogPos.defaultTextureIndex);
            }
        }
    }

    public void removeFroggerTargets(FroggerMapFile mapFile, ArrayList<StartPosition> startPositions, StartPosition startPos) {
        // Remove all start Target markers except for the selected
        for (StartPosition startOption : startPositions) {
            if (startOption.x == -1 || startOption.z == -1 || startOption.ringTextureIndex == -1) {
                continue;
            }

            FroggerGridStack gridStack = mapFile.getGridPacket().getGridStack(startOption.x, startOption.z);

            if (startPos.x == startOption.x && startPos.z == startOption.z) {
                // If the optional start tile was actually selected as the start,
                // Add the target on that tile if supported
                if (startOption.ringTextureIndex != -1) {

                    // None of the Frogger starts are ever under an overhang, so we can assume always 0 for the index
                    FroggerMapPolygon poly = gridStack.getGridSquares().get(0).getPolygon();

                    System.out.println("Changed start texture in " + mapFile.getFileDisplayName() + " at " +
                            startOption.x + "," + startOption.z + " from " + poly.getTextureId() +
                            " to " + startOption.ringTextureIndex);

                    poly.setTextureId((short) startOption.ringTextureIndex);

                    // Remove animation from the tile if there is one
                    for (FroggerMapAnimation mapAnimation : mapFile.getAnimationPacket().getAnimations()) {
                        List<FroggerMapAnimationTargetPolygon> uvs = mapAnimation.getTargetPolygons();
                        uvs.removeIf(uv -> {
                            boolean ret = verticesMatch(uv.getPolygon().getVertices(), poly.getVertices());
                            //if (ret) System.out.println("Was true");
                            return ret;
                        });
                    }
                    // Set Tile UVs if provided
                    if (startPos.UVs != null) {
                        // Could probably change the UVs to SCByteTextureUV instead but let's try this first
                        SCByteTextureUV[] textureUVs = new SCByteTextureUV[startPos.UVs.length];
                        // UV order was swapped, so workaround switch 3rd and 4th
                        ByteUV temp = startPos.UVs[2];
                        startPos.UVs[2] = startPos.UVs[3];
                        startPos.UVs[3] = temp;
                        for (int i = 0; i < startPos.UVs.length; i++) {
                            textureUVs[i] = new SCByteTextureUV(startPos.UVs[i].getU(), startPos.UVs[i].getV());
                        }
                        poly.setTextureUvs(textureUVs);
                        System.out.println("Setting UVs in " + mapFile.getFileDisplayName() + " at " +
                                startPos.x + "," + startPos.z);
                    }
                }
            }
            else {
                // If the optional start tile was not selected
                // Find all polygons with a matching vertex with the target graphic
                FroggerMapPolygon poly = gridStack.getGridSquares().get(0).getPolygon();

                ArrayList<int[]> targetMarkedPolys = new ArrayList<>();
                targetMarkedPolys.add(poly.getVertices()); // polys which had target graphic
                List<FroggerMapPolygon> polysToCheck = mapFile.getPolygonPacket().getPolygons();
                for (int i = 0; i < polysToCheck.size(); i++) {
                    FroggerMapPolygon mapPolygon = polysToCheck.get(i);
                    try {
                        if (mapPolygon.getTextureId() == startOption.ringTextureIndex
                                && startOption.defaultTextureIndex != -1) {
                            for (int[] entry : targetMarkedPolys) {
                                if (verticesMatch(entry, mapPolygon.getVertices())) {
                                    continue;
                                }
                                if (verticesIntersect(entry, mapPolygon.getVertices())) {
                                    // Set them to the default texture
                                    mapPolygon.setTextureId((short) startOption.defaultTextureIndex);
                                    /*
                                     * Add the poly just changed to the list of polys to
                                     * check because another poly with the target graphic
                                     * may share a vertex with one of them but not the
                                     * main poly from the original tile provided
                                     */
                                    targetMarkedPolys.add(mapPolygon.getVertices());
                                    // Restart at the beginning of the list of polys in
                                    // case any were missed initially
                                    i = -1;
                                }
                            }
                        }
                    } catch (Exception ignored) {}
                }
            }
        }
    }
}
