package com.ds.practice.javacollection;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

    public static void main(String[] args) {
        Queue<Integer> waitingQueue = new LinkedList<>();
        waitingQueue.add(12);
        waitingQueue.add(13);
        waitingQueue.add(14);
        waitingQueue.add(15);
        System.out.println("WaitingQueue : " + waitingQueue);
        int value = waitingQueue.remove();
        System.out.println(value);
        System.out.println("WaitingQueue : " + waitingQueue);
        int value1 = waitingQueue.poll();
        System.out.println(value1);
        System.out.println("WaitingQueue : " + waitingQueue);
    }
}
