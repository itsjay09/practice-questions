package com.ds.practice.staks;

import java.util.Stack;

public class QueueUsingStack {

    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();


        public static void enQueue(int item) {

            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(item);

            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }

        public static int dnQueue() {
            if (stack1.isEmpty()) {
                return 0;
            }

            int item = stack1.peek();
            stack1.pop();

            return item;
        }

        public static int top() {
            return stack1.peek();
        }

        public static void print() {
            System.out.println("Start");
            Stack<Integer> temp = stack1;
            while (!temp.empty()) {
                System.out.println(temp.pop());
            }
            System.out.println("End");
        }
    }
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        //queue.print();
        System.out.println(queue.dnQueue());
        System.out.println(queue.dnQueue());
        System.out.println(queue.dnQueue());
        System.out.println(queue.dnQueue());

    }
}
