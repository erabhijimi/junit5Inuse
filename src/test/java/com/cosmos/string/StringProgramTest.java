package com.cosmos.string;

import com.cosmos.string.StringProgramForTestcase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProgramTest {
    private static StringProgramForTestcase stringProgram=null;
    @BeforeAll
    static void init(){
        stringProgram=new StringProgramForTestcase();
    }
    @Test
    public void testReverseString(){
        String str = "abcdef";
        String rev = "fedcba";
        assertEquals(stringProgram.reverseString(str),rev,"Trying to reverse a String");
    }

}