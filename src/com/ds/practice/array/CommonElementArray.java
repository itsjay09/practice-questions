package com.ds.practice.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElementArray {

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;

        ArrayList<Integer> integers = commonElements(A, B, C, n1, n2, n3);
        System.out.println(integers);
    }

    static ArrayList<Integer> commonElements1(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> duplicate = new HashSet<Integer>();
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if (A[i] == B[j]) {
                    for (int k = 0; k <= n3; k++) {
                        if (B[j] == C[k] && !duplicate.contains(C[k])) {
                            list.add(C[k]);
                            duplicate.add(C[k]);
                        }
                    }
                }
            }
        }
        return list;
    }

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        TreeSet<Integer> setC = new TreeSet<>();

        for (int i = 0; i <= n1 - 1; i++) {
            setA.add(A[i]);
        }

        for (int i = 0; i <= n2 - 1; i++) {
            if (setA.contains(B[i])) {
                setB.add(B[i]);
            }
        }

        for (int i = 0; i <= n3 - 1; i++) {
            if (setB.contains(C[i])) {
                setC.add(C[i]);
            }
        }
        return new ArrayList<>(setC);
    }
}
