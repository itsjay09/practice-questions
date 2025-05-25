package com.ds.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRotationLeftSide {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;


        //store last element
        int lastElement  =  array[array.length  -1];

        // rorate the by one postion
        for (int i = array.length - 1 ; i > 0 ; i--) {
            array[i] = array[i -1];
        }

        array[0] = lastElement;


        System.out.println("Before :-> " + Arrays.toString(array));
//        System.out.println("Before :-> " + Arrays.toString(array));
//
//        int[] tempArray = arrayRotationLeftSideByN(array, steps, array.length);
//
//        System.out.println("After :-> " + Arrays.toString(tempArray));
    }


    public static  void rotatearrayByN2(int[] arr, int rot){

        int[]  tempArray = new int[arr.length];
        int n = arr.length - 1;

        for (int i = 0; i <= n ; i++ ){

            if(! ((rot - i) >= n) ){
                tempArray[i + rot ]= arr[i];
            }else{
                int remaningRotation = n - i;

                tempArray[remaningRotation ]= arr[i];
            }

        }

    }

    // Bru force Solution
    // Time complexity is O(rot * N)
    public static void rotateArrayByN1(int[] arr, int rot) {

        for (int i = 1; i <= rot; i++) {

            int lastElement = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];

            }

            arr[0] = lastElement;
        }
    }

}
