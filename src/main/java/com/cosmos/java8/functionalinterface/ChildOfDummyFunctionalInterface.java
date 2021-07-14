package com.cosmos.java8.functionalinterface;

//Class may implement several interfaces, whereas it may only extend only one class
//Must override the methods u have implemented or else will get C.E.

public class ChildOfDummyFunctionalInterface implements DummyFunctionalInterface,DummyFunctionalInterfaceSecond{

    @Override
    public void method() {

    }

    @Override
    public void method(int no) {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        DummyFunctionalInterface dummyFunctionalInterface = (number)->System.out.println("Got the number "+number);
        //Advantages of Lambda expression
        //No boiler plate code. reduces the lines of code to be written
        //Signature==>      () -> {body};
        dummyFunctionalInterface.method(1435);
    }
}
