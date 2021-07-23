package com.cosmos.designpattern;

public class SingletonClass {
    private static volatile SingletonClass singletonClass=null;
    private SingletonClass(){}

    public static SingletonClass getSingletonClass() {
        if(singletonClass==null){
            synchronized (SingletonClass.class){
                if(singletonClass==null){
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
