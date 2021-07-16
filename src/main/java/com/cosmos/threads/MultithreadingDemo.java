package com.cosmos.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadClassImplementingRunnable());
        thread.start();

        //Creating a pool
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i=0;i<20;i++){
            executorService.submit(new ThreadClassImplementingRunnable());
        }
        executorService.shutdown();
    }
}
