package com.ds.practice.linklist;

public class SinglyLinkedList {

    Node first;
    int size;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(15);
        sll.add(14);
        sll.add(13);
        sll.add(12);
        sll.insertAtLast(16);

        sll.pringLL();
        System.out.println("");
       // System.out.println("deleted Node :-> "+ sll.deleteElement(16).data);
        sll.insertAtIndex(77, 3);
        sll.pringLL();
    }

    public void insertAtIndex(int data, int index){
        if(first == null){
            first = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        int count = 1;
        Node tempNode = first;

        while (tempNode != null){
            if(count == index - 1 ){
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                return;
            }
            tempNode = tempNode.next;
            count++;
        }
    }

    public Node deleteElement(int data){
        if(first.data == data){
            first = first.next;
            return first;
        }

        Node ret = null;
        Node tempNode = first;
        while (tempNode != null) {
            if(tempNode.next.data == data){
                ret = tempNode.next;
                tempNode.next = tempNode.next.next;
                return ret;
            }
            tempNode = tempNode.next;
        }

        return ret;
    }

    public void add(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }

        Node tempNode = first;
        while (tempNode != null) {
            if (tempNode.next == null) {
                Node newNode = new Node(data);
                tempNode.next = newNode;
                break;
            }
            tempNode = tempNode.next;
        }
    }

    public void pringLL() {
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

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}
