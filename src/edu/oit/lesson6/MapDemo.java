package edu.oit.lesson6;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        Double d = new Double(0.2d);//double
        Float f;//float
        Character c;//char
        Boolean b = new Boolean(true);//boolean
        boolean flag = b.booleanValue();//拆箱
        double value = d.doubleValue();
        int i = 1;
        Integer integer = new Integer(i);//装箱
        
        hashMap.put("spring", 1);
        hashMap.put("summer", 2);
        System.out.println(hashMap.get("summer"));
    }

}
