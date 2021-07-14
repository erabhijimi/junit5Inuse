package com.cosmos.java8.array;

//Let us learn about Java 8 Stream Class and Parallel Sorting Method.
//Stream improves the readability as well as the efficiency of arrays.
//Converting arrays to stream also increases the overall performance of the program.
//you can also use the various Stream API methods that can simplify mapping, and filtering actions on arrays.

import java.util.Arrays;

public class ArrayDemo {
    public int sum(int[] intArray){
        //calculate sum using iterative method
        int sum = 0;
        for (int i = 0; i <intArray.length; i++)
            sum += intArray[i];
        // sum using streams
        sum = Arrays.stream(intArray)
                .sum();
        return sum;
    }
}
