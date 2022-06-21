package com.ds.practice.string;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "[()]}";
        boolean b = parenthesisCheck(str);
        System.out.println(b);
    }

    private static boolean parenthesisCheck(String x) {
        char[] arr = x.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == '{' && arr[j] != '}') {
                return false;
            }
            if (arr[i] == '[' && arr[j] != ']') {
                return false;
            }
            if (arr[i] == '(' && arr[j] != ')') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean ispar(String x) {
        // [({[([{ }])]})}
        // add your code here
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            //if c is a open bracket
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                // if c contains a closing bracket if stack is not empty
                if (!s.empty()) {
                    char top = s.peek();
                    if (top == '(' && c == ')' || top == '{' && c == '}' || top == '[' && c == ']') {
                        s.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (s.size() == 0) {
            return true;
        }
        return false;
    }
}
