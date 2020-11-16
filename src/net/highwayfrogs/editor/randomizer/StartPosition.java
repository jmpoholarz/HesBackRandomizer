package net.highwayfrogs.editor.randomizer;

import net.highwayfrogs.editor.file.map.StartRotation;

public class StartPosition {

    public short x; // Left-right grid position
    public short z; // Forward-back grid position
    public StartRotation rotation; // Direction the camera initially faces from this start
    public int zone; // Area of the map for this position; mutually exclusive with frog locations

    StartPosition(int x, int z, StartRotation rotation, int zone) {
        this.x = (short) x;
        this.z = (short) z;
        this.rotation = rotation;
        this.zone = zone;
    }
}
