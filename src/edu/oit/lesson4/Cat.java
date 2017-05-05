package edu.oit.lesson4;

public class Cat extends Animal{
    private String type;
    
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }
    public void catchMice() {
        System.out.println("catch a mouse");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("a mouse");
    }
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 10);
    }

}
