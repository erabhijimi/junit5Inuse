package com.cosmos.threads;

public class ThreadClassImplementingRunnable implements Runnable{
    private double no =0;
    public ThreadClassImplementingRunnable(int i){
            no=Math.random();
    }

    public ThreadClassImplementingRunnable() {

    }

    @Override
    public void run() {
        System.out.println("Thread is running task to print this :"+no+" this random number "+Thread.currentThread());
    }
}
