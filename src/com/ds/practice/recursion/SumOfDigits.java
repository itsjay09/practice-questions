package com.ds.practice.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int test = 12345;
        System.out.println(sumOfDigits(12341));
    }

    private static int sumOfDigits(int number) {
        if (number == 0) return 0;
        return (number % 10) + sumOfDigits(number / 10);
    }
}
