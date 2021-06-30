package com.cosmos.basics;

public class FactorialUsingRecursion {
    public int factorial(int no){
        if(no==1)
            return 1;
        return no*factorial(no-1);
    }
}
