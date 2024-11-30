package com.ds.practice.recursion;

public class FibonacciINthNumber {

    public static void main(String[] args) {

        System.out.println(fibonacciIterative(8));
    }

    public static int fibonacciRecursive(int num) {
        int fab = 0;

        return fab;
    }


    public static int fibonacciIterative(int num) {
        int fab = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= num; i++) {
            fab = a + b;
            b = a;
            a = fab;
        }

        return fab;
    }
}
