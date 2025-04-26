package net.highwayfrogs.editor.file.config;

import net.highwayfrogs.editor.file.config.data.WorldId;
import net.highwayfrogs.editor.file.config.exe.LevelInfo;

import java.util.*;

public class LevelShuffler {

    private static ArrayList<String> WORLD_IDS_BY_INDEX = new ArrayList<>(
            Arrays.asList(
                    "ORIGINAL", "SUBURBIA", "FOREST", "VOLCANO", "CAVE", "SKY", "SWAMP", "DESERT"
            )
    );

    public static ArrayList<String> VALID_LEVEL_NAMES = new ArrayList<String>(
            Arrays.asList(
                    "ORIGINAL1", "ORIGINAL2", "ORIGINAL3", "ORIGINAL4", "ORIGINAL5",
                    "SUBURBIA1", "SUBURBIA2", "SUBURBIA3", "SUBURBIA4", "SUBURBIA5",
                    "FOREST1", "FOREST2",
                    "VOLCANO1", "VOLCANO3", "VOLCANO2",
                    "CAVE1", "CAVE3", "CAVE4",
                    "SKY1", "SKY3", "SKY4", "SKY2",
                    "SWAMP1", "SWAMP4", "SWAMP3", "SWAMP2", "SWAMP5",
                    "DESERT1", "DESERT2", "DESERT3", "DESERT4", "DESERT5",
                    "JUNGLE1"
            )
    );
    public HashMap<String, LevelSelectSliceData> levelData = new HashMap<>();
    public static int NUMBER_OF_WORLDS = 9;
    public static int INDEX_BANANA_ZONE = 8;

    private List<LevelInfo> levelList;
    private Random random;

    public LevelShuffler(List<LevelInfo> levels, Random random) {
        this.levelList = levels;
        this.random = random;
        this.levelData = new HashMap<>();
        populateLevelData();
    }

    private void populateLevelData() {
        for (LevelInfo level : this.levelList) {
            if (level == null) continue;
            String levelName = level.getLevel() != null && level.getLevel().toString() != null
                    ? level.getLevel().toString() : "";
            if (VALID_LEVEL_NAMES.contains(levelName)) {
                levelData.put(
                        levelName,
                        new LevelSelectSliceData(
                            levelName,
                            level,
                            level.getLevelInt(),
                            level.getWorld(),
                            level.getTheme(),
                            level.getStackPosition(),
                            level.getLocalLevelId(),
                            level.getLevelsInWorld(),
                            level.getWorldImageSelectablePointer(),
                            level.getWorldImageVisitedPointer(),
                            level.getWorldImageNotTriedPointer(),
                            level.getLevelTexturePointer(),
                            level.getLevelNameTexturePointer(),
                            level.getLevelNameTextureInGamePointer()));
            }
        }
    }



    public void removeNonSingleplayerLevels() {
        List<LevelInfo> allLevels = this.levelList;
        List<LevelInfo> filteredLevels = new ArrayList<>();
        for (LevelInfo level : allLevels) {
            String levelName = level != null && level.getLevel() != null
                    && level.getLevel().toString() != null ? level.getLevel().toString() : "";
            if (VALID_LEVEL_NAMES.contains(levelName)) {
                filteredLevels.add(level);
            }
        }
        this.levelList = filteredLevels;
    }

//    public void shuffleWorlds() {
//        ArrayList<Map<String, LevelSelectSliceData>> levelsByWorld =
//                getLevelsByWorldExcludingBanana();
//
//        int k = 0;
//
//        for (int i = 1; i < NUMBER_OF_WORLDS - 1; i++) {
//            // NUMBER_OF_WORLDS - 2 because Banana Zone is always last and Retro first
//            // Select a world
//            int worldChosen = random.nextInt(levelsByWorld.size());
//            // Assign levels in that world to this index in the stack
//            Map<String, LevelSelectSliceData> levelsInWorld = levelsByWorld.get(worldChosen);
//
//            //ArrayList<LevelSelectSliceData> levels = new ArrayList<>();
//            //for (LevelSelectSliceData data : levelsInWorld.values()) {
//            //    levels.add(data);
//            //}
//
//            for (LevelSelectSliceData level : levelsInWorld.values()) {
//                level.stackPosition = i;
//                switch (i) {
//                    // Always keep Retro Zone first due to hardcoded Retro 1
//                    //case 0:
//                    //    //level.world = WorldId.ORIGINAL;
//                    //    level.theme = MAPTheme.ORIGINAL; break;
//                    case 1:
//                        //level.world = WorldId.SUBURBIA;
//                        level.theme = MAPTheme.SUBURBIA; break;
//                    case 2:
//                        //level.world = WorldId.FOREST;
//                        level.theme = MAPTheme.FOREST; break;
//                    case 3:
//                        //level.world = WorldId.VOLCANO;
//                        level.theme = MAPTheme.VOLCANO; break;
//                    case 4:
//                        //level.world = WorldId.CAVES;
//                        level.theme = MAPTheme.CAVE; break;
//                    case 5:
//                        //level.world = WorldId.SKY;
//                        level.theme = MAPTheme.SKY; break;
//                    case 6:
//                        //level.world = WorldId.SEWER;
//                        level.theme = MAPTheme.SWAMP; break;
//                    case 7:
//                        //level.world = WorldId.DESERT;
//                        level.theme = MAPTheme.DESERT; break;
//                }
//                level.writeToLevelInfo(this.levelList.get(k));
//                k++;
//            }
//            levelsByWorld.remove(worldChosen);
//        }
//    }

    public void shuffleLevelsInWorlds() {
        for (Map<Integer, LevelSelectSliceData> world : getLevelsByWorld()) {
            ArrayList<LevelSelectSliceData> levelsInWorld = new ArrayList<>(world.values());
            ArrayList<LevelSelectSliceData> levelsToPickFrom = new ArrayList<>(world.values());

            int levelIndex = 0;
            while (levelsToPickFrom.size() > 0) {
                int i = random.nextInt(levelsToPickFrom.size());
                LevelSelectSliceData chosenLevel = levelsToPickFrom.get(i);
                LevelSelectSliceData levelBeingEdited = levelsInWorld.get(levelIndex);

                int _level = levelBeingEdited.level;
                levelBeingEdited.level = chosenLevel.level;
                chosenLevel.level = _level;

                long _levelTexturePointer = levelBeingEdited.levelTexturePointer;
                levelBeingEdited.levelTexturePointer = chosenLevel.levelTexturePointer;
                chosenLevel.levelTexturePointer = _levelTexturePointer;

                long _levelNameTextureInGamePointer = levelBeingEdited.levelNameTextureInGamePointer;
                levelBeingEdited.levelNameTextureInGamePointer = chosenLevel.levelNameTextureInGamePointer;
                chosenLevel.levelNameTextureInGamePointer = _levelNameTextureInGamePointer;

                long _levelNameTexturePointer = levelBeingEdited.levelNameTexturePointer;
                levelBeingEdited.levelNameTexturePointer = chosenLevel.levelNameTexturePointer;
                chosenLevel.levelNameTexturePointer = _levelNameTexturePointer;

                levelIndex++;
                levelBeingEdited.writeToLevelInfo();
                levelsToPickFrom.remove(i);
            }
        }
//        for (int i = 0; i < NUMBER_OF_WORLDS - 1; i++) {
//            ArrayList<LevelInfo> levels = getLevelsInWorld(i);
//            int levelsInWorld = levels.size();
//            for (int j = 0; j < levelsInWorld; j++) {
//                int levelChosen = random.nextInt(levels.size());
//                LevelInfo level = levels.get(levelChosen);
//                level.localLevelId = j;
//                levels.remove(level);
//            }
//        }
    }


    private Map<Integer, LevelSelectSliceData> getLevelsInWorld(String worldPrefix) {
        //TODO: Order by localLevelId instead of alphabetically
        Map<Integer, LevelSelectSliceData> levels = new TreeMap<>();
        for (String levelName : levelData.keySet()) {
            if (levelName.contains(worldPrefix)) {
                levels.put(levelData.get(levelName).localLevelId, levelData.get(levelName));
            }
        }
        return levels;
    }

    private ArrayList<Map<Integer, LevelSelectSliceData>> getLevelsByWorld() {
        ArrayList<Map<Integer, LevelSelectSliceData>> levelsByWorld = new ArrayList<>();
        levelsByWorld.add(getLevelsInWorld("ORIGINAL"));
        levelsByWorld.add(getLevelsInWorld("SUBURBIA"));
        levelsByWorld.add(getLevelsInWorld("FOREST"));
        levelsByWorld.add(getLevelsInWorld("VOLCANO"));
        levelsByWorld.add(getLevelsInWorld("CAVE"));
        levelsByWorld.add(getLevelsInWorld("SKY"));
        levelsByWorld.add(getLevelsInWorld("SWAMP"));
        levelsByWorld.add(getLevelsInWorld("DESERT"));
        levelsByWorld.add(getLevelsInWorld("JUNGLE"));

        return levelsByWorld;
    }

}
