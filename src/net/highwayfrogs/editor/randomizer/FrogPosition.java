package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.standard.psx.ByteUV;

public class FrogPosition {

    public float x; // Left-right grid position
    public float y; // Vertical position on the map
    public float z; // Forward-back grid position
    public float yaw; // Rotation about the Z axis
    public float pitch; // Rotation about the Y axis
    public float roll; // Rotation about the X axis
    public int zone; // Area of the map for this position; mutually exclusive with Frogger start

    public int tileX; // X tile in the map of the frog
    public int tileZ; // Z tile in the map of the frog
    public int stackIndex; // which index in the stack of tiles at that location to change the gfx
    public int ringTextureIndex; // texture that holds the ring graphic
    public int defaultTextureIndex; // index of the tile when not the frog ring tile
    public ByteUV[] UVs; // UVs for the tile texture

    FrogPosition(double x, double y, double z, double yaw, double pitch, double roll, int zone) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
        this.roll = (float) roll;
        this.zone = zone;
        this.tileX = -1;
        this.tileZ = -1;
        this.stackIndex = 0;
        this.defaultTextureIndex = -1;
        this.ringTextureIndex = -1;
        this.UVs = null;
    }

    FrogPosition(double x, double y, double z, double yaw, double pitch, double roll, int zone,
                 int tileX, int tileZ, int stackIndex,
                 int defaultTextureIndex, int ringTextureIndex, ByteUV[] UVs) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
        this.roll = (float) roll;
        this.zone = zone;
        this.tileX = tileX;
        this.tileZ = tileZ;
        this.stackIndex = stackIndex;
        this.defaultTextureIndex = defaultTextureIndex;
        this.ringTextureIndex = ringTextureIndex;
        this.UVs = UVs;
    }

}
