package com.ds.practice.array;

public class SumSubArray {

    public static void main(String[] args) {
        int[] array = {1, 4, 20, 3, 10, 5};
        int target = 33;

        subArraySum(array, target);
        subArraySum(array, array.length, target);
    }

    // Brut Force Solution:
    // Time complexity for this is O(n^2)
    // Space Complexity is O(1) no extra space is required
    public static int[] subArraySum(int[] array, int target) {
        int[] reArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum == target) {
                    reArray[0] = i;
                    reArray[1] = j;
                }
            }
        }
        return reArray;
    }

    // Optimize Solution
    // Time Complexity: O(n)
    // Space Complexity O(1) constant time
    static int[] subArraySum(int arr[], int n, int targetSum) {
        int[] reArray = new int[2];
        int sum = arr[0], start = 0;
        for (int i = 1; i < n; i++) {
            while (sum > targetSum && start < i - 1) {
                sum = sum - arr[start];
                start++;
            }
            if (sum == targetSum) {
                int end = i - 1;
                reArray[0] = start;
                reArray[1] = end;
            }
            if (i < n) {
                sum = sum + arr[i];
            }
        }
        return reArray;
    }
}
