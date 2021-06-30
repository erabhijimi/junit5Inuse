package com.cosmos.basics;

public class BasicPrograms {
    //1.Swap 2 numbers without using 3rd variable
    //2.Check Prime number in the most optimized way
    //3.Check Palindrome Number
    //4.Find Factorial using recursion
    public int factorial(int no){
        if(no==1)
            return 1;
        return no*factorial(no-1);
    }
    //5.Print Fibonacci series till a given number
}
