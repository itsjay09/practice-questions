package com.ds.practice.hashtable;

public class HashKeyValue {

    String kay;
    int value;

    public HashKeyValue(String key, int value){
        this.kay = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue {" +
                " kay='" + kay + '\'' +
                ", value=" + value +
                '}';
    }
}
