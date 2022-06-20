package com.ds.practice.array;

public class LeadersInArray {

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        leaderInArray(arr, arr.length);
    }

    // Time complexity of O(n)
    private static void leaderInArray(int[] arr, int n){
        int i = n - 1;
        int maxElement = arr[i];
        System.out.print(maxElement + " ");
        while (i > 0) {
            if(arr[i - 1] > maxElement){
                maxElement = arr[i - 1];
                System.out.print(maxElement+ " ");
            }
            i--;
        }
    }


    // Time complexity of O(n * n)
    private static void leaderInArray1(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            boolean flag = true;
            inner:
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] > element) {
                    flag = false;
                    break inner;
                }
            }
            if (flag) {
                System.out.print(element+ " ");
            }
        }
    }
}
