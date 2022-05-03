package com.ds.practice;

public class Pattern {


    public static void main(String[] args) {
        pattern2(5);
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4

    public static void pattern(int n) {
        if (n == 0) {
            return;
        }
        pattern(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    public static void pattern1(int n){
        if(n == 0){
            return;
        }
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        pattern1( n - 1);
    }


    public static void pattern2(int n){

        if(n == 1){
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        pattern2(n -1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
