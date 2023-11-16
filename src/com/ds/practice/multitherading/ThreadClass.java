package com.ds.practice.multitherading;

public class ThreadClass {

    static class ThreadExte extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }

    public static void main(String[] args) {
//        ThreadExte thread1 = new ThreadExte();
//        thread1.start();
//        ThreadExte thread2 = new ThreadExte();
//        thread2.start();
//        thread2.interrupt();

        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            ThreadExte object = new ThreadExte();
            object.start();
        }
    }
}
