package com.ds.practice.string;

import java.util.Deque;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        String testString = "JAYESH";

        System.out.println(reverseUsingStack(testString));

        System.out.println(reverseStringRecursive(testString));
    }

    public static StringBuilder reverseStringRecursive(String str) {

        StringBuilder revStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }

        return revStr;
    }

    public static StringBuilder reverseUsingStack(String S){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            str.append(stack.pop());
        }

        return str;
    }

    public static void reverseStringRecursion() {

    }


}
