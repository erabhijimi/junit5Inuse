package com.cosmos.exceptionhandling;

public class CustomDefinedExceptionDemo {
    public boolean testAge(int age){
        if(age<18){
            throw new InvalidAgeException("Ur under age");
        }
        return true;
    }

}
