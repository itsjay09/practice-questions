package com.ds.practice.string;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        System.out.println(reverseUsingStack("JAYESH"));
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

}
