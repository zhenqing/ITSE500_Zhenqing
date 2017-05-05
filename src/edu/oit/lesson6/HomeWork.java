package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork {

    public static int numUniqueValues(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return set.size();
    }

    public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        int size1 = l1.size();
        int size2 = l2.size();
        int count = Math.max(size1, size2);
        for (int i = 0; i < count; i++) {
            if (i < size1) {
                result.add(l1.get(i));
            }
            if (i < size2) {
                result.add(l2.get(i));
            }
        }
        return result;
    }

    public static int leastCommon(Map<String, Integer> map) {
        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer key : map.values()) {
            if (frequency.containsKey(key)) {
                frequency.put(key, frequency.get(key) + 1);
            } else {
                frequency.put(key, 1);
            }
        }
        int min = 2147483647;
        for (Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                array[0] = map.get(key).intValue();
                array[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return array;
    }

    public static void main(String[] args) {

    }

}
