package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.StartRotation;
import net.highwayfrogs.editor.file.standard.psx.ByteUV;

import java.util.ArrayList;

public class StartPosition {

    public short x; // Left-right grid position
    public short z; // Forward-back grid position
    public StartRotation rotation; // Direction the camera initially faces from this start
    public int zone; // Area of the map for this position; mutually exclusive with frog locations
    public ArrayList<Integer> bannedFrogZones; // Other zones frogs cannot be placed with this start

    public int ringTextureIndex; // texture that holds the target graphic
    public int defaultTextureIndex; // index of the tile when not the target tile
    public ByteUV[] UVs; // UVs for the tile texture


    StartPosition(int x, int z, StartRotation rotation, int zone) {
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
        bannedFrogZones = new ArrayList<>();

        this.ringTextureIndex = -1;
        this.defaultTextureIndex = -1;
        this.UVs = null;
    }

    StartPosition(int x, int z, StartRotation rotation, int zone,
                  ArrayList<Integer> bannedFrogZones) {
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
        this.bannedFrogZones = bannedFrogZones;

        this.ringTextureIndex = -1;
        this.defaultTextureIndex = -1;
        this.UVs = null;
    }

    StartPosition(int x, int z, StartRotation rotation, int zone,
                  int defaultTextureIndex, int ringTextureIndex, ByteUV[] UVs) {
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
        bannedFrogZones = new ArrayList<>();

        this.ringTextureIndex = ringTextureIndex;
        this.defaultTextureIndex = defaultTextureIndex;
        this.UVs = UVs;
    }

    StartPosition(int x, int z, StartRotation rotation, int zone, int defaultTextureIndex,
                  int ringTextureIndex, ByteUV[] UVs, ArrayList<Integer> bannedFrogZones) {
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
        this.bannedFrogZones = bannedFrogZones;

        this.ringTextureIndex = ringTextureIndex;
        this.defaultTextureIndex = defaultTextureIndex;
        this.UVs = UVs;
    }
}
