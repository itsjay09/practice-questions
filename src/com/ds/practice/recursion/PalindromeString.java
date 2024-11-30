package com.ds.practice.recursion;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "abccba";
        boolean isPalindrome = checkIsPalindrome(str, 0, str.length() - 1);
        System.out.println(isPalindrome);
    }

    private static  boolean checkIsPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        //If first and last characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkIsPalindrome(str, start + 1, end - 1);
    }



}
