package edu.oit.lesson4;

public class Animal {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Animal() {
        
    }
    
    public void move() {
        System.out.println("I am moving");
    }
    
    public void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", 4);
        cat.eat();
    }

}
