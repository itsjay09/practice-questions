package com.ds.practice.map;

import java.util.*;

public class CustomMap {
    public KeyValue[] customMap;
    public int index = 0;
    private int DEFAULT_SIZE = 10;

    public CustomMap() {
        customMap = new KeyValue[DEFAULT_SIZE];
    }

    public void put(int key, String value) {
        if (isKeyExist(key))
            return;
        KeyValue newValue = new KeyValue(key, value);
        customMap[index++] = newValue;
    }

    public boolean isKeyExist(int key) {
        for (int i = 0; i < customMap.length; i++)
            if (customMap[i] != null && customMap[i].key == key)
                return Boolean.TRUE;
        return Boolean.FALSE;
    }

    public void printMap() {
        System.out.print("{ ");
        for (int i = 0; i < customMap.length; i++)
            if (customMap[i] != null)
                System.out.print(customMap[i].key + "=" + customMap[i].value + ", ");

        System.out.print(" }");
    }

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        System.out.println(ht);
    }
}
