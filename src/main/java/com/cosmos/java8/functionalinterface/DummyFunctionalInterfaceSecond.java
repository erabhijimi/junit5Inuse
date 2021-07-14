package com.cosmos.java8.functionalinterface;

@FunctionalInterface
public interface DummyFunctionalInterfaceSecond {
    void method();
    default void m1(){
        System.out.println("Default method called m1");
    }
    default void m2(){
        System.out.println("Default method called m2");
    }
    static void m3(){
        //Utility method
    }
}
