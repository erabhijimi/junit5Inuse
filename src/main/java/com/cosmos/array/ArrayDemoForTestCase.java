package com.cosmos.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemoForTestCase {
    public int findClosest(int[] intArray){
        int i =Arrays.stream(intArray).boxed()
                .sorted()
                .reduce(0,(a,b)->b-a);
        System.out.println(i);
        return 0;
    }
}
