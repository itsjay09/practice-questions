package com.ds.practice.array;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 3, 4, 5, 7};
        System.out.println(checkIfArrayIsSorted(array));
    }

    // check if array is sorted
    private static boolean checkIfArrayIsSorted(int [] arr){
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
           if(arr[i] > arr[ i + 1]){
               return false;
           }
        }
        return true;
    }
}
