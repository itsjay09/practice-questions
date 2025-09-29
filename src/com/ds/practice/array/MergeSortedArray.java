package com.ds.practice.array;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 6, 0, 0, 0};

        int[] nums2 = {1, 2, 3};

        merge(nums1, nums1.length, nums2, nums2.length);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ", ");
        }
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        int p = (m + n) - 1;

        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
}
