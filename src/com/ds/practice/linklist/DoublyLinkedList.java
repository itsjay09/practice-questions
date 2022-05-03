package com.ds.practice.linklist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    Node first;
    Node last;
    int size;

    public static void main(String[] args) {
        DoublyLinkedList sll = new DoublyLinkedList();
        sll.add(16);
        sll.add(15);
        sll.add(14);
        sll.add(13);
        sll.add(12);

        sll.printLL();
        System.out.println("");
         //System.out.println("deleted Node :-> "+ sll.removeFirst());
        System.out.println("deleted Node :-> "+ sll.removeAtIndex(1));
        //sll.addAtIndex(77, 4);
        sll.printLL();
    }

    public void add(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = first;
        first.previous = newNode;
        first = newNode;
        size++;
    }

    public void addAtIndex(int data, int index) {
        if (first == null) {
            first = new Node(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        if (index == 1) {
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }

        Node currNode = first;
        if (index > size) {
            while (currNode != null) {
                if (currNode.next == null) {
                    currNode.next = newNode;
                    newNode.previous = currNode;
                    size++;
                    return;
                }
                currNode = currNode.next;
            }
        }

        int count = 1;

        while (currNode != null) {
            if (count == index) {
                newNode.next = currNode;
                newNode.previous = currNode.previous;
                currNode.previous.next = newNode;
                size++;
                return;
            }
            currNode = currNode.next;
            count++;
        }
    }


    public void printLL() {
        Node tempNode = first;
        System.out.print("");
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print(" null");
    }


    static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public Integer removeFirst() {
        int returnValue = 0;
        if (first == null) {
            size--;
            return returnValue;
        }

        if (first.next != null) {
            returnValue = first.data;
            first.next.previous = null;
            first = first.next;
            size--;
            return returnValue;
        }
        return returnValue;
    }

    public Integer removeLast() {
        int returnValue = 0;
        if (first == null) {
            size--;
            return returnValue;
        }

        Node currNode = first;
        while (currNode != null) {
            if (currNode.next == null) {
                returnValue = currNode.data;
                currNode.previous.next = null;
                size--;
                return returnValue;
            }
            currNode = currNode.next;
        }

        return returnValue;
    }

    public Integer removeAtIndex(int index){
        int returnValue = 0;

        if(index > size){
            throw new IndexOutOfBoundsException("Index Not out ****");
        }

        if(index == 1){
            return removeFirst();
        }

        if(index == size){
            return removeLast();
        }

        int count = 1;
        Node currNode = first;
        while (currNode != null) {
            if (count == index) {
                currNode.next.previous = currNode.previous;
                currNode.previous.next = currNode.next;
                size--;
                return returnValue;
            }
            currNode = currNode.next;
            count++;
        }

        return returnValue;
    }


}
