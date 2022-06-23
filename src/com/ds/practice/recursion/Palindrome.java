package com.ds.practice.recursion;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abba";
        boolean isPalindrome = checkIsPalindrome(str, 0, str.length() - 1);
        System.out.println(isPalindrome);
    }

    private static  boolean checkIsPalindrome(String str, int start, int end) {
        // If there is only one character
        if (start == end)
            return true;
        //If first and last characters do not match
        if (str.charAt(start) != str.charAt(end))
            return false;
        // If there are more than two characters
        if (start < end + 1)
            checkIsPalindrome(str, start + 1, end - 1);
        return true;
    }
}
