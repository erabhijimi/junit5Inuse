package com.cosmos.java8;

import java.util.Arrays;

public class TestMethods {
    public void test1(int[] intArray) {
        //to print all +ve integers in an array with sorted order
        Arrays.stream(intArray).
                filter(n->n>0).
                sorted().
                forEach(System.out::println);
    }
}
