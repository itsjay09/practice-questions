package com.ds.practice.linklist;

import java.util.HashMap;
import java.util.Map;

public class LinkedListFrequency {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(2);


        System.out.println(6 / 2);

        sll.printLL();

        Map<Integer, Integer> integerIntegerMap = linkedListFrequency(sll.head);
        System.out.println("");

        System.out.println(integerIntegerMap);


    }

    public static Map<Integer, Integer> linkedListFrequency(SinglyLinkedList.Node head) {
        Map<Integer, Integer> map = new HashMap<>();

        SinglyLinkedList.Node currentNode = head;

        while (currentNode != null) {

            if (map.containsKey(currentNode.data)) {
                Integer i = map.get(currentNode.data);
                map.put(currentNode.data, i + 1);

            } else {
                map.put(currentNode.data, 1);
            }

            currentNode = currentNode.next;
        }

        return map;
    }
}
