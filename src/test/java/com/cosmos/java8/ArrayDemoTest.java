package com.cosmos.java8;

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
    public void testSum(){
        int intArray[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
        int expected = 1050;
        int actual = arrayDemo.sum(intArray);
        assertEquals(expected,actual,"to find sum of all digits in an array");
    }
    @Test
    public void testSumWithNegativeNumbers(){
        int intArray[] = {-5,-10,-15,20,25,30,35,40};
        int expected = 120;
        int actual = arrayDemo.sum(intArray);
        assertEquals(expected,actual,"to find sum of all digits in an array WithNegativeNumbers");
    }

}