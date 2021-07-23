package com.cosmos.designpattern;

public class SingletonClassTest {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();
        SingletonClass singletonClass3 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass1.hashCode());
        System.out.println(singletonClass2.hashCode());
        System.out.println(singletonClass3.hashCode());
    }
}
