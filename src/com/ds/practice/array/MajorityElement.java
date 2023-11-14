package com.ds.practice.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int A[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majorityElement(A, A.length));
    }

    static int majorityElement1(int a[], int size) {

        for (int i = 0; i <= size - 1; i++) {
            int count = 1;
            for (int j = i + 1; j <= size - 1; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > (size - 1) / 2) {
                return a[i];
            }
        }
        return -1;
    }


    // calculate each key and its accourence
    // check which orrurence of match
    static int majorityElement(int a[], int size) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= size - 1; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i <= size - 1; i++) {
            if (map.get(a[i]) > (size / 2)) {
                return a[i];
            }
        }
        return -1;
    }

}
