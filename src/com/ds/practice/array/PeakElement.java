package com.ds.practice.array;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {15};
        System.out.println(peakElement(arr, arr.length));
    }
    private static int peakElement(int[] arr, int n) {
        if(n == 1){
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                if (i - 1 < 0) {
                    if (arr[i] > arr[i + 1]) {
                        return i;
                    }
                }
                if (i + 1 > n - 1) {
                    if (arr[i] > arr[i - 1]) {
                        return i;
                    }
                }
            } else {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
