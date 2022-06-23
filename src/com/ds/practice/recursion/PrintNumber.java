package com.ds.practice.recursion;

public class PrintNumber {

    public static void main(String[] args) {
        printFromNto1(10);
        System.out.println();
        printFrom1toN(10);
    }

    private static void printFromNto1(int n) {
        if (n == 0) return;
        System.out.print(n +", ");
        printFromNto1(n - 1);
    }

    private static void printFrom1toN(int n) {
        if (n == 0) return;
        printFrom1toN(n - 1);
        System.out.print(n +", ");
    }


    public static void print1(int n) {
        //base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print1(n - 1);
    }

    public static void print(int n) {
        // base condition
        if (n == 0) {
            return;
        }
        // hypothesis print n -1
        print(n - 1);
        // induction last print
        System.out.println(n);
    }
}
