package com.cosmos.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,3,-4,-8,15,-116};
        printPositiveNumbers(arr);
        printMaxInTheArray(arr);
        printSecondLargestNumber(arr);
        PrintSortedArrayInDescendingOrder(arr);
    }

    private static void PrintSortedArrayInDescendingOrder(int[] arr) {
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

    private static void printSecondLargestNumber(int[] arr) {
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }

    private static void printMaxInTheArray(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max val is :"+max);
    }

    private static void printPositiveNumbers(int[] arr) {
        Arrays.stream(arr).filter(i->i>0).forEach(System.out::println);
    }
}
