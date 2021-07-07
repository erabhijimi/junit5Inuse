package com.cosmos.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDemoTest {
    private static ArrayDemo arrayDemo = null;
    @BeforeAll
    static void init(){
        arrayDemo = new ArrayDemo();
    }
    @Test
    public void testFindClosest(){
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int actual = arrayDemo.findClosest(testArray);
        assertEquals(0,actual);
    }

}