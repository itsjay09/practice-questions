package com.ds.practice;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        String str = "{([])}";
//        //System.out.println(ispar(str));
//        Stack<Character> stack = new Stack<>();
//        stack.push('{');
//        stack.push('(');
//        stack.push('[');
//        stack.push('}');
//
//        for(Character ch : stack){
//            System.out.println();
//        }


        System.out.println(sumDigits(55555));

      //  System.out.println(factorial(3));
    }


    public static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return sumDigits( n / 10) + n % 10;
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return factorial(n - 1) * n;

    }

    static boolean ispar(String x) {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if(top == '{' && ch == '}' || top == '[' && ch == ']' || top == '(' && ch == ')'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
