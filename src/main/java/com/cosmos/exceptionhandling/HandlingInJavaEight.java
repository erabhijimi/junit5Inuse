package com.cosmos.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandlingInJavaEight {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("10","20","30","xy");

        /*//Convert to intList
        List<Integer> integerList = stringList.stream()
                .map(Integer::parseInt)                 //will throw NumberFormat Exception
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);*/

        /*//Approach 1
        stringList.forEach(s-> {
            try {
                System.out.println(Integer.parseInt(s));
            }catch (Exception ex) {
                System.out.println("Ran into an Exception :"+ex);
            }
        });*/

        //Approach 2
        stringList.forEach(HandlingInJavaEight::printIntegers);
    }

    private static void printIntegers(String str) {
        try {
            System.out.println(Integer.parseInt(str));
        }catch (Exception ex) {
            System.out.println("Ran into an Exception :"+ex);
        }
    }
}
