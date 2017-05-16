package edu.oit.lesson10;

public class Apple extends Fruit {
    public Apple() {
        super("red");
    }
    public void printCount() {
        super.printCount();
        printSum();
    }
}
