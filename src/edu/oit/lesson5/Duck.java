package edu.oit.lesson5;

public class Duck implements Flyable, Swimmable{

    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("swim on water");
    }

}
