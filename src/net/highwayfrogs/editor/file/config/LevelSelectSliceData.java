package net.highwayfrogs.editor.file.config;

import net.highwayfrogs.editor.file.config.data.WorldId;
import net.highwayfrogs.editor.file.config.exe.LevelInfo;
import net.highwayfrogs.editor.file.map.MAPTheme;

public class LevelSelectSliceData {

    public String name; // name of the level in the code
    public LevelInfo levelInfo; // location in memory where the level is stored

    public int level; // index of the level map in getConfig().getAllLevelInfo()
    public WorldId world;
    public int stackPosition; // index of the world in the level stack
    public MAPTheme theme; // used to group a block in the list
    public int localLevelId; // index of the level in the world
    public int levelsInWorld; // number of levels in a world
    /* Memory pointers to slice graphical data */
    public long worldImageSelectablePointer;
    public long worldImageVisitedPointer;
    public long worldImageNotTriedPointer;
    public long levelTexturePointer; // memory pointer to level preview image
    /* Memory pointers to level name graphical representations */
    public long levelNameTexturePointer;
    public long levelNameTextureInGamePointer;

    /* Still unsure which controls where the gold frog graphic goes in the stack (hardcoded?)
     * Also unsure what controls the unlocked levels at the start (hardcoded?)
     * Also also unsure what controls which level the level select opens to (hardcoded to ORG1?)
     */

    LevelSelectSliceData(
            String name,
            LevelInfo levelInfo,
            int level,
            WorldId world,
            MAPTheme theme,
            int stackPosition,
            int localLevelId,
            int levelsInWorld,
            long worldImageSelectablePointer,
            long worldImageVisitedPointer,
            long worldImageNotTriedPointer,
            long levelTexturePointer,
            long levelNameTexturePointer,
            long levelNameTextureInGamePointer
    ) {
        this.name = name;
        this.levelInfo = levelInfo;
        this.level = level;
        this.world = world;
        this.theme = theme;
        this.stackPosition = stackPosition;
        this.localLevelId = localLevelId;
        this.levelsInWorld = levelsInWorld;
        this.worldImageSelectablePointer = worldImageSelectablePointer;
        this.worldImageVisitedPointer = worldImageVisitedPointer;
        this.worldImageNotTriedPointer = worldImageNotTriedPointer;
        this.levelTexturePointer = levelTexturePointer;
        this.levelNameTexturePointer = levelNameTexturePointer;
        this.levelNameTextureInGamePointer = levelNameTextureInGamePointer;
    }


    public void writeToLevelInfo() {
        levelInfo.setLevel(level);
        levelInfo.setWorld(world);
        levelInfo.setTheme(theme);
        levelInfo.setStackPosition(stackPosition);
        levelInfo.setLocalLevelId(localLevelId);
        levelInfo.setLevelsInWorld(levelsInWorld);
        levelInfo.setWorldImageSelectablePointer(worldImageSelectablePointer);
        levelInfo.setWorldImageVisitedPointer(worldImageVisitedPointer);
        levelInfo.setWorldImageNotTriedPointer(worldImageNotTriedPointer);
        levelInfo.setLevelTexturePointer(levelTexturePointer);
        levelInfo.setLevelNameTexturePointer(levelNameTexturePointer);
        levelInfo.setLevelNameTextureInGamePointer(levelNameTextureInGamePointer);
    }

}
