package com.ds.practice.string;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        String str = "hq";
        System.out.println(isPalindrome(str));
    }

    static int isPalindrome(String S) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        String S2 = "";
        for (int i = 0; i < S.length(); i++) {
            S2 += stack.peek();
            stack.pop();
        }

        if (S.equals(S2)) {
            return 1;
        }
        return 0;
    }


}
