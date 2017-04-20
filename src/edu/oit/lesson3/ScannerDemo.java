package edu.oit.lesson3;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first multiple:");
        number1 = input.nextInt();
        
        System.out.printf("the number you enter is :%d\n", number1);
    }

}
