package edu.oit.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    
    public static List<String> twice(List<String> list) {
        List<String> result = new ArrayList<>();
        result.addAll(list);
        result.addAll(list);
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("How");
        list.add("Are");
        list.add("You");
        System.out.println(twice(list));
    }

}
