package com.cosmos.exceptionhandling;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomDefinedExceptionDemoTest {
    private static CustomDefinedExceptionDemo customDefinedExceptionDemo=null;

    @BeforeAll
    static void init(){
        customDefinedExceptionDemo = new CustomDefinedExceptionDemo();
    }

    @Test
    @DisplayName("With valid age")
    void testAgeWithValidAge() {
        assertTrue(customDefinedExceptionDemo.testAge(20),"With valid age");
    }
    @Test
    @DisplayName("With Invalid age")
    void testAgeWithInValidAge() {
        assertThrows(InvalidAgeException.class,()->customDefinedExceptionDemo.testAge(15),"With invalid Age");
    }
}