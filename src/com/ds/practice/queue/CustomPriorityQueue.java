package com.ds.practice.queue;

import javax.naming.SizeLimitExceededException;

public class CustomPriorityQueue {

    private int[] prioQueueAr;
    private int size;
    private int number;

    public static void main(String[] args) throws SizeLimitExceededException {
        CustomPriorityQueue customPriorityQueue = new CustomPriorityQueue(10);
        customPriorityQueue.insert(12);
        customPriorityQueue.insert(13);
        customPriorityQueue.insert(17);
        customPriorityQueue.insert(15);

        System.out.print("Deleted elements from queue: ");
        System.out.print(customPriorityQueue.remove() + " ");
        System.out.print(customPriorityQueue.remove() + " ");
        System.out.print(customPriorityQueue.remove() + " ");
        System.out.print(customPriorityQueue.remove() + " ");

    }

    public CustomPriorityQueue(int size) {
        this.size = size;
        prioQueueAr = new int[this.size];
        number = 0;
    }

    public void insert(int value) throws SizeLimitExceededException {
        int i;
        if (isFull()) {
            throw new SizeLimitExceededException("Cannot insert " + value + ", Queue is full");
        }
        if (number == 0)
            prioQueueAr[number++] = value; //If no values in PriorityQueue- insert at starting position, i.e. at 0th position.
        else {
            for (i = number - 1; i >= 0; i--) {
                if (value > prioQueueAr[i])
                    prioQueueAr[i + 1] = prioQueueAr[i]; //if value is larger, shift elements upward till value is larger.
                else
                    break;
            }
            prioQueueAr[++i] = value; // insert element in space created by upward shift of elements.
            number++;
        }
    }

    public int remove() throws SizeLimitExceededException {
        if (isEmpty()) {
            throw new SizeLimitExceededException("Queue is empty");
        }
        return prioQueueAr[--number];
    }

    public boolean isFull() {
        return (number == size);
    }

    public boolean isEmpty() {
        return (number == 0);
    }
}
