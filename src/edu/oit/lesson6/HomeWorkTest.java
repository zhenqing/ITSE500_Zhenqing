package edu.oit.lesson6;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void testNumUniqueValues() {
        Integer[] values = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15, 8, 10};
        List<Integer> l1 = Arrays.asList(values);
        assertEquals(HomeWork.numUniqueValues(l1), 7);
    }

    @Test
    public void testAlternate() {
        Integer[] values = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15, 8, 10};
        List<Integer> l1 = Arrays.asList(values);
        Integer[] values2 = { 3, 7, 2, 15, 15, 8, 10};
        List<Integer> l2 = Arrays.asList(values2);
        Integer[] values3 = { 3, 3,7, 7,3, 2,-1, 15,2, 15, 3,8, 7,10,2, 15, 15, 8, 10};
        List<Integer> l3 = Arrays.asList(values3);
        assertEquals(HomeWork.alternate(l1, l2),l3);
    }

    @Test
    public void testLeastCommon() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alyssa", 22);
        map.put("Char", 25);
        map.put("Dan", 25);
        map.put("Jeff", 20);
        map.put("Kasey", 20);
        map.put("Kim", 20);
        map.put("Mogran", 25);
        map.put("Ryan", 25);
        map.put("Stef", 22);
        assertEquals(HomeWork.leastCommon(map),22);
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = {0,1};
        assertArrayEquals(HomeWork.twoSum(nums, target),result);
    }
}
