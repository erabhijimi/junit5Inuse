package com.cosmos.java8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMethodsTest {
    private static TestMethods testMethods=null;
    @BeforeAll
    static void init(){
        testMethods=new TestMethods();
    }
    @Test
    public void testRemoveIfMethod(){
        int[] intArray = {2,6,4,0,-2,13,19,-21};
        testMethods.test1(intArray);
    }

}