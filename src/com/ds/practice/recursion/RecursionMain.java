package com.ds.practice.recursion;

public class RecursionMain {

    public static void main(String[] args) {
       // print  5 number
       // printNumberUsingRecursion(10);
        System.out.println(fibonacciNumber(50));
    }

    // print 1 2 3 4 5 6 7

    public static void printNumberUsingRecursion(int n){

        if(n == 0){
            return;
        }

        printNumberUsingRecursion(n - 1 );
        System.out.println(n);
    }

    // factorial -> 1 * 2 * 3 * 5 * 6.. n

    public static int factorialOfNumber(int n){
        if(n == 1){
            return 1;
        }
        return factorialOfNumber( n - 1 ) * n;
    }

    // 1 1 2 3 5 8 13 21 43 55 ....
    // f(n) = f(n - 1) + f(n -2)

    public static long fibonacciNumber(int n){
        if(n <= 1){
            return n;
        }

        return fibonacciNumber( n - 1) + fibonacciNumber(n - 2);
    }





}
