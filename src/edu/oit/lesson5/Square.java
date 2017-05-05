package edu.oit.lesson5;

public class Square extends Shape {
    private int line;
    

    public int getLine() {
        return line;
    }



    public void setLine(int line) {
        this.line = line;
    }



    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return this.getLine() * this.getArea();
    }

}
