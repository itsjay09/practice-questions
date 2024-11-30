package com.ds.practice.string;

public class ReverseStringUsingRecursion {

    public static void main(String[] args) {

        String testString = "abcba";

        char[] charArray = testString.toCharArray();


        System.out.println(charArray);

        reverseStringRecursion(charArray, 0, charArray.length - 1);

        System.out.println(charArray);

    }


    public static void reverseStringRecursion(char[] charArray, int start, int end) {

        if (start >= end) {
            return;
        }

        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;

        reverseStringRecursion(charArray, start + 1, end - 1);
    }
}
