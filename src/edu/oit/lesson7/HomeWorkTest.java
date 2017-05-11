package edu.oit.lesson7;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void testRemoveRange() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(17);
        set1.add(-1);
        set1.add(4);
        set1.add(9);
        set1.add(2);
        set1.add(14);
        Set<Integer> set2 = new HashSet<>();
        set2.add(17);
        set2.add(-1);
        set2.add(14);
        assertTrue(set2.equals(HomeWork.removeRange(set1, 1, 10)));
    }

    @Test
    public void testTeacher() {
        
    }

}
