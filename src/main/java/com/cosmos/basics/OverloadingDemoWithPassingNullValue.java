package com.cosmos.basics;

//Gives Compile error as both can get null so must specify the type

public class OverloadingDemoWithPassingNullValue {
    // Overloaded methods
    public void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(String name)
    {
        System.out.println("fun(String ) ");
    }

    public static void main(String[] args) {
        OverloadingDemoWithPassingNullValue overloadingDemoWithPassingNullValue = new OverloadingDemoWithPassingNullValue();
        overloadingDemoWithPassingNullValue.fun((Integer) null);
    }
}
