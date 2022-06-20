package com.ds.practice.array;

import java.util.Arrays;

public class ReversalAlgo {

    public static void main(String[] args) {
        int[] arrayLeft = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayLeft));
        int r = 2;
        arrayLeft = rotateLeft(arrayLeft, r);
        System.out.println(Arrays.toString(arrayLeft));
    }

    private static int[] rotateLeft(int[] arr, int r) {
        //r %= arr.length;
        int start = 0;
        int end = arr.length - 1;
        //rotating the first r elements
        reverse(arr, 0, r - 1);
        //rotating length-r elements
        reverse(arr, r, end);
        //reversing the entire array
        reverse(arr, start, end);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
