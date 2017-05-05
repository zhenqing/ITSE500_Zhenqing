package edu.oit.lesson5;

public class Triangle extends Shape {

    private int base;
    private int height;
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return this.getBase() * this.getHeight()/2;
    }

}
