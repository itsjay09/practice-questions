package com.ds.practice.recursion;

public class CheckPalindromeNumber {

    public static void main(String[] args) {
        System.out.println(checkIfNumberIsPalindromeRecursive(121));
    }

    public static boolean checkIfNumberIsPalindromeRecursive(int num) {
        boolean isPalindrome = false;

        int tempNum = num;
        int revNum = 0;

        while (tempNum != 0) {
            int digit = tempNum % 10;
            revNum = revNum * 10 + digit;

            tempNum = tempNum / 10;
        }

        if (num == revNum) {
            return true;
        }

        return isPalindrome;
    }
}
