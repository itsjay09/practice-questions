package com.ds.practice.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListHashTable {

    private LinkedList<HashKeyValue>[] hashTable;

    public LinkedListHashTable(){
        hashTable = new LinkedList[10];

        for (int i = 0; i < 10; i++) {
           hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, int value){
        int hashedKay = getHashedKey(key);
        hashTable[hashedKay].add(new HashKeyValue(key, value));
    }

    public HashKeyValue get(String key){
        int hashedKey= getHashedKey(key);

        ListIterator<HashKeyValue> iterator = hashTable[hashedKey].listIterator();
        HashKeyValue hashKeyValue = null;
        while (iterator.hasNext()){
            hashKeyValue = iterator.next();
            if(hashKeyValue.kay.equals(key)){
                return hashKeyValue;
            }
        }
        return null;
    }

    public void print(){
        if(hashTable == null){
            return;
        }

        for (int i = 0; i < hashTable.length; i++) {
            ListIterator<HashKeyValue> iterator = hashTable[i].listIterator();
            System.out.print("[ ");
            while (iterator.hasNext()){
                System.out.print(iterator.next() +" -> ");
            }
            System.out.println(" ]");
        }
    }

    public int getHashedKey(String key){
        return key.length() % hashTable.length;
    }

    public static void main(String[] args) {

        LinkedListHashTable ht = new LinkedListHashTable();
        ht.put("Jayesh", 11);
        ht.put("Kalpesh", 22);
        ht.put("jayu", 33);
        ht.put("Kalpratu", 44);
        ht.put("tushar", 55);

       // ht.print();

        System.out.println(ht.get("K alpesh"));
        System.out.println(ht.get("tushar"));
    }
}
