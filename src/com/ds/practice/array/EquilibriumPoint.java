package com.ds.practice.array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        long[] arr = {1};
        int i = equilibriumPoint(arr, arr.length);
        System.out.println(i);
    }

    // Time complexity of O(n)
    public static int equilibriumPoint(long arr[], int n) {
        int leftSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftSum == sum) {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    // Time complexity of O(n * n)
    public static int equilibriumPoint1(long arr[], int n) {
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n - 2; i++) {
            int left = i - 1, right = i + 1;
            int lSum = 0, rSum = 0;
            // sum of elements before
            while (left >= 0) {
                lSum += arr[left--];
            }
            //sum of elements after
            while (right <= n - 1) {
                rSum += arr[right++];
            }
            if (rSum == lSum) {
                return i + 1;
            }
        }
        return -1;
    }
}
