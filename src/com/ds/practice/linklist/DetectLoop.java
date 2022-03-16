package com.ds.practice.linklist;

import java.util.HashSet;

public class DetectLoop {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    public boolean detectLoop(Node head) {
        Node tempNode = head;
        HashSet<Node> set = new HashSet<>();

        while (tempNode.next != null) {
            if (set.contains(tempNode)) {
                return true;
            }
            set.add(tempNode);
            tempNode = tempNode.next;
        }
        return false;
    }

    public int findNthFromLast(Node head, int n) {
///
        Node tempNode = head;
        int size = 0;

        while (tempNode != null) {
            size++;
            tempNode = tempNode.next;
        }

        int lastElement = size - (n - 1);
        int count = 1;

        tempNode = head;
        while (tempNode != null) {
            if (lastElement == count) {
                return tempNode.data;
            }
            count++;
            tempNode = tempNode.next;
        }

        return -1;
    }
}
