package com.cosmos.basics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialUsingRecursionTest {
    private static FactorialUsingRecursion factorialUsingRecursion = null;
    @BeforeAll
    static void init(){
        factorialUsingRecursion = new FactorialUsingRecursion();
    }
    @Test
    void testFactorial(){
        int expected =24;
        int actual = factorialUsingRecursion.factorial(4);
        assertEquals(expected,actual,"Running Factorial with correct input");
    }

}