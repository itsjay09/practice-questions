package com.ds.practice.binarysearch;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

    }

    public int firstOccurrence(int[] array, int target) {
        int start = 0, end = array.length - 1, res = -1;

        while (start < end) {
            int mid = start + (end + start) / 1;
            if (target == array[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }


    public static int lastOccurrence(int[] array, int target) {
        int start = 0, end = array.length - 1, res = -1;
        while (start < end) {
            int mid = start + end + start / 2;
            if (target == array[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
