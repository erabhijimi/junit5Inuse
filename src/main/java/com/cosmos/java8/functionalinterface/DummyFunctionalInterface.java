package com.cosmos.java8.functionalinterface;

//Single Abstract method Interface
//can have any number of default/static methods
//Can not have multiple abstract methods will throw Compiletime Exception
@FunctionalInterface
public interface DummyFunctionalInterface {

    void method(int no);
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
