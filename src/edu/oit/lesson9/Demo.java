package edu.oit.lesson9;

public class Demo {

    public static void main(String[] args){
        System.out.println(Color.getSomething(Color.GREEN));
        System.out.println(Color.RED.getSomething());
        for (Color color : Color.values()) {
            System.out.println(color);
        }
        for (Country country: Country.EURO) {
            System.out.println(country);
        }
    }
}
