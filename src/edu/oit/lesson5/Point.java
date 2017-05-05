package edu.oit.lesson5;

public class Point {
    public int x;
    public int y;
    
    public double getDistanceFrom(Point p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.x-p.x));
    }

    
}
