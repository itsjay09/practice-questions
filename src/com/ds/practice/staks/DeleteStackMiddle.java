package com.ds.practice.staks;

import java.util.Arrays;
import java.util.Stack;

public class DeleteStackMiddle {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(Arrays.toString(stack.toArray()));
        int middleElement = stack.size() / 2 + 1;
        deleteMiddleElement(stack, middleElement);
        System.out.println(Arrays.toString(stack.toArray()));
    }


    public static Stack<Integer> deleteMiddleElement(Stack<Integer> stack, int middleElement) {
        if (middleElement == 1) {
            stack.pop();
            return stack;
        }
        int temp = stack.peek();
        stack.pop();
        deleteMiddleElement(stack, middleElement - 1);
        stack.push(temp);
        return stack;
    }
}
