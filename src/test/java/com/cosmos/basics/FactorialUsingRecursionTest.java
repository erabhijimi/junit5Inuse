package com.cosmos.basics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicProgramsTest {
    private static BasicPrograms basicPrograms = null;
    @BeforeAll
    static void init(){
        basicPrograms = new BasicPrograms();
    }
    @Test
    void testFactorial(){
        int expected =24;
        int actual = basicPrograms.factorial(4);
        assertEquals(expected,actual,"Running Factorial with correct input");
    }

}