package edu.oit.lesson10;

public class StaticDemo {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Fruit();
        Fruit orange = new Fruit();
        Fruit kiwi = new Fruit();
        String string = "str";
        String str = new String();
        apple.printCount();
        Fruit.printSum();
        orange.printCount();
        apple.printCount();
    }

}
