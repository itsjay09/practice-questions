package com.ds.practice.array;

public class PeakElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 7};
        int peakElement = findPeakElementUsingBS(nums);
        System.out.println(peakElement);
    }

    // Using Binary Search of Time Complexity O(log n)
    public static int findPeakElementUsingBS(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // check if mid is peak
            if (mid > 0 && mid < end
                    && nums[mid] > nums[mid + 1]
                    && nums[mid] > nums[mid - 1]) {
                return mid;
            }
            // check edge case
            if (mid == 0 && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid == end && nums[mid] > nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Brut Force Solution Time Complexity O(n)
    private static int peakElementBrutForce(int[] arr, int n) {
        // check edge cases
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        // check betweek edge cases element
        for (int i = 1; i < n - 2; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
