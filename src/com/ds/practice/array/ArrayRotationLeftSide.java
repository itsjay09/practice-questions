package com.ds.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRotationLeftSide {

    public static void main(String[] args) {
//        int[] array = {12, 15, 13, 14, 17, 33};
//        int length = array.length ;
//        int rotation = 3;
//        System.out.println(Arrays.toString(array));
//        int[] resultArray = arrayRotation(array, length, rotation);
//        System.out.println(Arrays.toString(resultArray));
        int[] arr = {1, 2, 3, 4, 5};
        Set<Integer> set = new HashSet<>();
        rotateArraynOppositeDire(arr, 2, arr.length);
    }


    public static void rotateArraynOppositeDire(int[] arr, int d, int n){

        System.out.print("Bfore Rotate : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }


        int[] temp = new int[n];
        int k = n - 1;
        int length = n - 1;

        while( k >= 0){
            if((k - d) < 0){
                int diff =  d - k;
                int mainDiff =  length - diff;
                temp [mainDiff + 1] = arr [k];
            }else{
                temp[ k - d ] = arr [k];
            }
            k--;
        }
        arr = temp;
        System.out.println("");
        System.out.print("After Rotate : ");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + ", ");
        }

    }

    // with O(n) time complexity
    public static void rotateArrayn(int[] arr, int d, int n){

        System.out.print("Bfore Rotate : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }


        int[] temp = new int[n];
        int k = 0;
        int length = n - 1;

        while( k < n){
            if((k + d) > length){
                int diff = length - k ;
                int mainDiff =  d - diff;
                temp [mainDiff - 1] = arr [k];
            }else{
                temp[ k + d ] = arr [k];
            }
            k++;
        }
        arr = temp;
        System.out.println("");
        System.out.print("After Rotate : ");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + ", ");
        }

    }

   public static int[] arrayRotation(int[] array, int length, int rotation){

       for (int j = 1; j <= rotation; j++) {
           int[] temp = new int[length];
           for (int i = length-1; i >= 0; i--) {
             if(i == 0){
                 temp[array.length-1] = array[0];
             } else{
                 temp[i-1] = array[i];
             }
           }
           array = temp;
       }
       return array;
   }
}
