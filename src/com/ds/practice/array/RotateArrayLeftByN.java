package com.ds.practice.array;

public class RotateArrayLeftByN {

    public static void main(String[] args) {

        // index      0  1  2  3  4
        // input  ->  1  2  3  4  5	 and rotate = 3
        // output ->  4  5  1  2  3

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr.length);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
        rotateArrayLeftByN(arr, 2);
    }


    public static void rotateArrayLeftByN(int[] arr, int rotation){

        int[] tempArray = new int[arr.length];
        int lengthArray = arr.length - 1;

        for (int i = lengthArray; i >= 0 ; i--) {
            if( (i - rotation) >= 0  ){
                tempArray[i - rotation] = arr[i];
            }else{
                int rem = lengthArray - (rotation - i);
                int pos = rem + 1;
                tempArray [pos] = arr[i];
            }
        }

        // print array
        for (int i = 0; i <= tempArray.length -1; i++) {
            System.out.print(tempArray[i] + ", ");
        }
    }
}
