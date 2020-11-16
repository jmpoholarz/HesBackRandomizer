package net.highwayfrogs.editor.randomizer;

public class FrogPosition {

    public float x; // Left-right grid position
    public float y; // Vertical position on the map
    public float z; // Forward-back grid position
    public float yaw; // Rotation about the Z axis
    public float pitch; // Rotation about the Y axis
    public float roll; // Rotation about the X axis
    public int zone; // Area of the map for this position; mutually exclusive with Frogger start

    FrogPosition(double x, double y, double z, double yaw, double pitch, double roll, int zone) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
        this.roll = (float) roll;
        this.zone = zone;
    }
}
