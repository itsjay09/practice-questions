package com.ds.practice.hashtable;

import java.util.Arrays;

public class HashTableArrayImpl {

    private int[] array;
    private int size;

    HashTableArrayImpl() {
        array = new int[10];
    }


    public void put(String key, int value) {
        int hashedKey = getHashedKay(key);
        if (isOccupied(hashedKey)) {
            // Collision problem is solved
            int stoppedIndex = hashedKey;

            if (hashedKey == array.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppedIndex) {
                hashedKey = (hashedKey + 1) % array.length;
            }
        }

        if(isOccupied(hashedKey)){
            System.out.println("array is full");
        }else{
            array[hashedKey] = value;
            size++;
        }
    }


    public boolean isOccupied(int hashedKey) {
        return array[hashedKey] != 0;
    }

    public int get(String key) {
        int hashedKey = getHashedKay(key);
        return array[hashedKey];
    }

    private int getHashedKay(String key) {
        int hashedKey = key.length() % array.length;
        return hashedKey;
    }

    public void print() {
        if (array.length == 0) {
            System.out.println("{}");
            return;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        HashTableArrayImpl hashArray = new HashTableArrayImpl();
        hashArray.put("jay", 11);
        hashArray.put("kalpesh", 22);
        hashArray.put("template", 33);
        hashArray.put("naresh", 44);
        hashArray.put("asdfgh", 55);
        hashArray.put("arun", 66);
        hashArray.put("qw", 88);
        hashArray.put("aa", 99);
        hashArray.put("template", 00);

        hashArray.print();
        System.out.println(hashArray.get("aa"));
        System.out.println(hashArray.get("aa"));
    }
}


