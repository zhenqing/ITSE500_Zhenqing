package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.addFirst(2);
        System.out.println(linkedList.get(0));
        HashMap map;

        ArrayList arrayList = new ArrayList();
        arrayList.add("Spring");
        arrayList.add("Autumn");
        arrayList.set(1, "Summer");
        System.out.println(arrayList.toString());
    }

}
