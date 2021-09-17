package interview;

import java.util.Arrays;

public class Wisen {
    public static void main(String[] args) {
        int arr[]={1,3,8,5,2,7,-9};
        int far = farthestFromZero(arr);
        System.out.println("farthest is :"+far);
    }
    private static int farthestFromZero(int[] arr) {
        int far =0;
        int farMax = Arrays.stream(arr).max().getAsInt();
        int farMin = Arrays.stream(arr).min().getAsInt();
        int minAbs =Math.abs(farMin);
        if(minAbs>=farMax)
            far = farMin;
        else
            far = farMax;
        return far;
    }
}
