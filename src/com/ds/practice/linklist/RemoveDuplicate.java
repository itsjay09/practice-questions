package com.ds.practice.linklist;

import com.ds.practice.linklist.CustomLinkedList.Node;

import java.util.LinkedList;

public class RemoveDuplicate {

    public static void main(String[] args) {

        CustomLinkedList ll = new CustomLinkedList();
        ll.push(16);
        ll.push(15);
        ll.push(14);
        ll.push(13);
        ll.push(12);
        ll.push(12);
        ll.push(12);

        System.out.println(1 % 10);

        //removeDuplicate(ll.head);
    }


    public static Node removeDuplicate(Node head) {
        Node tempNode = head;
        while (tempNode != null && tempNode.next != null) {
            if (tempNode.data == tempNode.next.data) {
                tempNode.next = tempNode.next.next;
            } else {
                tempNode = tempNode.next;
            }
        }
        return tempNode;
    }

    static Node addTwoLists(Node first, Node second) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        Node tempNode = first;
        while (tempNode != null) {
            str1.append(first.data);
            tempNode = tempNode.next;
        }

        tempNode = first;
        while (tempNode != null) {
            str2.append(first.data);
            tempNode = tempNode.next;
        }

        int total = Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());
        Node dummy = new Node(0);
        Node l = dummy;
        int remain = total;
        int elm = 0;

        while (elm != 0) {
            l.next = new Node(remain % 10);
            remain = remain / 10;
            l = l.next;
        }

        return dummy;
    }
}
