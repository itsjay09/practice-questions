package com.ds.practice.array;

import java.util.Arrays;

public class ArrayRotationRightSide {

    public static void main(String[] args) {

        int[] array = {12, 15, 13, 14, 17, 33};
        int length = array.length ;
        int rotation = 3;

        System.out.println(Arrays.toString(array));
        int[] resultArray = arrayRotation(array, length, rotation);
        System.out.println(Arrays.toString(resultArray));

    }

    private static int[] arrayRotation(int[] array, int length, int rotation) {
        for (int j = 1; j <= rotation; j++) {
            int[] temp = new int[length];
            for (int i = 0; i <= length - 1 ; i++) {
                if(i == length - 1){
                    temp[0] = array[i];
                }else{
                    temp[i + 1] = array[i];
                }
            }
            array = temp;
        }
        return array;
    }
}
