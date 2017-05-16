package edu.oit.lesson10;

public class Fruit {
    public static int count;
    public final String flavor;
    public static final String season;
    static {
        season = "Spring";
    }
    
    private String color;
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit() {
        this.flavor = "sweet";
        count++;
    }
    
    public Fruit(String color) {
        super();
        this.flavor = "sweet";
        this.color = color;
    }
    
    public static void printSum() {
        System.out.println(Fruit.count);
    }
    
    public static int add(int a, int b) {
        System.out.println(a);
        return a + b;
    }

    public void printCount() {
        final String park;
        park = "Yellow Stone park";
        String info = "";
        info = "my color is " + color + ", there is total " + count + " fruit";
        info += "good taste";
        System.out.println("fafaodf".length());
        printSum();
    }
    
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        add(x, y);
        System.out.println(x);
        Fruit apple = new Apple();
        Fruit banana = new Fruit();
        Fruit orange = new Fruit();
        Fruit kiwi = new Fruit();
        apple.printCount();
    }
}
