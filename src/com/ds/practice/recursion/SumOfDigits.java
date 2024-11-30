package com.ds.practice.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int test = 12345;
        System.out.println(sumOfDigitsIterativeWay(test));
        System.out.println(sumOfDigits(test));
    }

    private static int sumOfDigitsIterativeWay(int num) {
        int sum = 0;

        int tempNum = num;

        while (tempNum != 0) {

            sum = sum + (tempNum % 10);

            tempNum = tempNum / 10;
        }

        return sum;
    }

    private static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return sumOfDigits(number / 10) + (number % 10);
    }
}
