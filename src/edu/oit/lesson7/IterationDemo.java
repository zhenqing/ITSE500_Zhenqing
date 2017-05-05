package edu.oit.lesson7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterationDemo {

    public static void main(String[] args) {
        Collections c;
        Set<String> set = new HashSet<>();
        set.add("San Francisco");
        set.add("San Diego");
        set.add("Sacramento");
        set.add("San Jose");
        // 增强型for循环
        for (String city : set) {
            System.out.println(city.substring(3));
        }

        // 迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Integer[] nums = { 2, 3, 5, 1, 5 };
        List<Integer> list = Arrays.asList(nums);

        int max = 0;
        // 普通for循环
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element > max) {
                max = element;
            }
        }

        System.out.println(max);

        max = 0;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

        max = 0;
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            if (i.next() > max) {
                max = i.next();
            }
        }
        System.out.println(max);
    }

}
