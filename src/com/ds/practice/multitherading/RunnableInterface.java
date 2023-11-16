package com.ds.practice.multitherading;

public class RunnableInterface {

    static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

//        Thread thread1 = new Thread(new RunnableImpl());
//        thread1.start();
//        Thread thread2 = new Thread(new RunnableImpl());
//        thread2.start();

        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new RunnableImpl());
            object.start();
        }
    }
}
