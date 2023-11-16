package com.ds.practice.multitherading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread Started");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpl());
        Thread thread2 = new Thread(new RunnableImpl());
        Thread thread3 = new Thread(new RunnableImpl());
        Thread thread4 = new Thread(new RunnableImpl());
        Thread thread5 = new Thread(new RunnableImpl());

//        It is used to execute tasks sequentially.
        ExecutorService executor = Executors.newSingleThreadExecutor();
//        ExecutorService executor = Executors.newCachedThreadPool();
//        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(thread1);
        executor.execute(thread2);
        executor.execute(thread3);
        executor.execute(thread4);
        executor.execute(thread5);

        executor.shutdown();

    }
}
