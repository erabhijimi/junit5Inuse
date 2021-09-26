package interview;

import java.util.Arrays;

public class TechMahindra {
    public static void main(String[] args) {
        System.out.println("Hi");
        int arr[]= {1,5,88,2,64,23};
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
