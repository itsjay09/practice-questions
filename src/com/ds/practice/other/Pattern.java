package com.ds.practice.other;

import java.util.Stack;

public class Pattern {

    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(ispar(str));
    }

    static boolean ispar(String x) {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (top == '{' && ch == '}' || top == '[' && ch == ']' || top == '(' && ch == ')') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
