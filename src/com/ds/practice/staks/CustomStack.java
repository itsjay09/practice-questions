package com.ds.practice.staks;

import java.util.Stack;

public class CustomStack {

    int[] array;
    int top;
    int DEFAULT_SIZE = 4;

    public CustomStack() {
        array = new int[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);

      //  System.out.println("Peek : " + stack.peek());

        //stack.printStack();
        //System.out.println("pop element-> "+stack.pop());
        //System.out.println("After pop");
         stack.printStack();
    }

    public void push(int data) {
        if (top == 0) {
            array[0] = data;
            top++;
            return;
        }

        if(top == array.length){
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[top] = data;
        top++;
    }

    public int pop() {
        int ret = array[top - 1];
        array[top - 1] = 0;
        top--;
        return ret;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public int peek() {
        return array[top - 1];
    }

}
