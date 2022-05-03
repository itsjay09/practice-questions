package com.ds.practice.linklist;

public class CustomLinkedList {

    Node head;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            size++;
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" null");
        System.out.println();
    }

    // find the middle element from linked list
    public int findMiddleElement() {
        if (size == 0) {
            return 0;
        }

        int index = size / 2;
        Node tempNode = head;
        int elementReturn = 0;

        for (int i = 1; i <= size; i++) {
            if (i == index + 1) {
                elementReturn = tempNode.data;
                return elementReturn;
            }
            tempNode = tempNode.next;
        }
        return 0;
    }

    public int findNthElement(int index) {
        if (head == null) {
            return 0;
        }

        Node tempNode = head;
        for (int i = 1; i <= size; i++) {
            if(i == index){
                return tempNode.data;
            }
            tempNode = tempNode.next;
        }
        return 0;
    }

    public int findNthFromLast(int n){
        if(head == null || n > size){
            return 0;
        }

        int elementReturn = size - (n + 2);
        Node tempNode = head;
        for (int i = 1; i < size; i++) {
            if(i == elementReturn){
                return tempNode.data;
            }
            tempNode = tempNode.next;
        }
        return 0;
    }


    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        for (int i = 8; i >= 1; i--) {
            linkedList.push(i);
        }

        linkedList.printList();
        System.out.println("Middle element "+ linkedList.findMiddleElement());
        System.out.println("Nth element "+ linkedList.findNthElement(8));
    }
}
