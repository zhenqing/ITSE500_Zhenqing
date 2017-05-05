package edu.oit.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testGetReverse() {
        assertEquals(ReverseString.getReverse("abcdef"), "fedcba");
    }

}
