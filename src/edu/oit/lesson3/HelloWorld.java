package edu.oit.lesson3;

public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("hello world");
        Hello hello = new Hello();
        System.out.println(hello.add(3, 4));
    }

}

class Hello {
    public Hello() {
        
    }
    public int add(int a, int b){
        return a + b;
    }
}