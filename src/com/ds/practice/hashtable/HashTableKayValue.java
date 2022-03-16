package com.ds.practice.hashtable;

public class HashTableKayValue {

    private HashKeyValue[] hashTable;

    public HashTableKayValue(){
        hashTable = new HashKeyValue[10];
    }

    public void put(String key, int value){

        int hashedKey = getHashedKay(key);
        if (isOccupied(hashedKey)) {
            // Collision problem is solve
            int stoppedIndex = hashedKey;

            if (hashedKey == hashTable.length) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppedIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if(isOccupied(hashedKey)){
            System.out.println("array is full");
        }else{
            hashTable[hashedKey] = new HashKeyValue(key, value);
        }
    }


    public boolean isOccupied(int hashedKey) {
        return hashTable[hashedKey] != null;
    }

    public HashKeyValue get(String key) {
        int hashedKey = getHashedKay(key);

        if(hashTable[hashedKey] != null
                && hashTable[hashedKey].kay.equals(key)){
            return hashTable[hashedKey];
        }

        int stoppedIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashTable[hashedKey] != null
                && !hashTable[hashedKey].kay.equals(key)
                && hashedKey != stoppedIndex){
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(hashTable[hashedKey] != null
                && hashTable[hashedKey].kay.equals(key)){
            return hashTable[hashedKey];
        }else{
            return null;
        }
    }

    public HashKeyValue delete(String key){
        int hashedKey = getHashedKay(key);
        HashKeyValue returnValue = null;
        if(hashTable[hashedKey] != null
                && hashTable[hashedKey].kay.equals(key)){
            returnValue = hashTable[hashedKey];
            hashTable[hashedKey] = null;
            return returnValue;
        }

        int stoppedIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        if(hashTable[hashedKey] != null
                && hashTable[hashedKey].kay.equals(key)){
            returnValue = hashTable[hashedKey];
            hashTable[hashedKey] = null;
            return returnValue;
        }else{
            return null;
        }
    }


    private int getHashedKay(String key) {
        int hashedKey = key.length() % hashTable.length;
        return hashedKey;
    }

    public void print() {
        if(hashTable.length == 0){
            System.out.println("{}");
            return;
        }

        for (int i = 0; i < hashTable.length - 1; i++) {
            System.out.println(hashTable[i]);
        }
    }

    public static void main(String[] args) {

        HashTableKayValue hashTable = new HashTableKayValue();
        hashTable.put("jay", 11);
        hashTable.put("kalpesh", 22);
        hashTable.put("template", 33);
        hashTable.put("naresh", 44);
        hashTable.put("asdfgh", 55);
        hashTable.put("arun", 66);
        hashTable.put("qw", 88);
        hashTable.put("aa", 99);
        hashTable.put("template", 00);

        hashTable.print();


        System.out.println(hashTable.delete("qw"));
        //    System.out.println(hashTable.get("aa"));
        System.out.println("--------");
        hashTable.print();

    }
}
