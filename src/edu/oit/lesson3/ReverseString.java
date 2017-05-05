package edu.oit.lesson3;

import java.util.Scanner;

public class ReverseString {

    public static String getReverse(String str) {
        String result = "";
        for (int i = str.length(); i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string you want to reverse:");
        String str = scanner.next();
    }

}
