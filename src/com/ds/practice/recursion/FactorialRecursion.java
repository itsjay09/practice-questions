package com.ds.practice.recursion;

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println(factorialOne(6));
        System.out.println(factorialTwo(6));
    }

    public static int factorialOne(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialOne(n - 1);
    }

    public static int factorialTwo(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = n * factorialTwo(n - 1);
        return factorial;
    }
}
