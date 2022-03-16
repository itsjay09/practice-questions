package com.ds.practice.recursion;

public class RecursionMain {

    public static void main(String[] args) {
       // print  5 number
        print(1);
    }

    public static void print(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
