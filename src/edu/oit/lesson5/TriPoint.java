package edu.oit.lesson5;

public class TriPoint extends Point {
    public int z;

    public double getDistanceFrom(TriPoint p) {
        return Math.sqrt(
                (this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.x - p.x) + (this.z - p.z) * (this.z - p.z));
    }
}
