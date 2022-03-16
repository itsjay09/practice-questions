package com.ds.practice.other;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";
        String op = reverseWords(str);
        System.out.println(op);
    }

    public static String reverseWords(String str){

        //String : i.like.this.program.very.much
        //Output: much.very.program.this.like.i
        String[] arr = str.split("\\.");
        Stack<String> queue = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                ret = ret + queue.peek();
                queue.pop();
            }else{
                ret = ret + queue.peek() + ".";
                queue.pop();
            }

        }
        return ret;
    }

}
