package com.ds.practice.recursion;

public class PrintNumber {

    public static void main(String[] args) {
        // if 1 to n ---> print
       // print(50);

        // print n to 1
        print1(10);
    }

    public static void print1(int n){
        //base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        print1(n -1 );
    }

    public static void print(int n){
        // base condition
        if (n == 0){
            return;
        }
        // hypothesis print n -1
        print(n-1);
        // induction last print
        System.out.println(n);
    }
}
