package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.standard.psx.ByteUV;
import net.highwayfrogs.editor.games.sony.frogger.map.packets.FroggerMapFilePacketGeneral.FroggerMapStartRotation;

import java.util.ArrayList;

/**
 * A location where Frogger may spawn in a level.
 */
public class StartPosition {

    /**
     * The name assigned to this start position, unique from all other start positions in the game.  Typically,
     * in the form of {LEVEL_NAME}_{ZONE}{NUMBER}.  For example, "SUB1_B1"
     */
    public String id;

    /**
     * Left-right grid position
     */
    public short x;

    /**
     * Forward-back grip position
     */
    public short z;

    /**
     * Direction the camera initially faces from this start
     */
    public FroggerMapStartRotation rotation;

    /**
     * Area of the map for this position; mutually exclusive with frog locations
     */
    public int zone;

    /**
     * A list of FrogletPosition IDs that can be chosen when this start position is selected by the randomizer.
     * There must be at least 5, or the randomizer will fall back to the default positions.
     */
    public ArrayList<String> bannedFroglets;

    /**
     * Texture that holds the target graphic
     */
    public int ringTextureIndex;

    /**
     * Index of the tile when not the target tile
     */
    public int defaultTextureIndex;

    /**
     * UVs for the tile texture
     */
    public ByteUV[] UVs;

    StartPosition(String id, int x, int z, FroggerMapStartRotation rotation, int zone, int defaultTextureIndex,
                  int ringTextureIndex, ByteUV[] UVs, ArrayList<String> bannedFroglets) {
        this.id = id;
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
        this.bannedFroglets = bannedFroglets;

        this.ringTextureIndex = ringTextureIndex;
        this.defaultTextureIndex = defaultTextureIndex;
        this.UVs = UVs;
    }
}
