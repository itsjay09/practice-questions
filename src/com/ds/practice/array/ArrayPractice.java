package com.ds.practice.array;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 3, 4, 5, 7};

        searchingInArray(args);
    }


    public static void searchingInArray(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
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
