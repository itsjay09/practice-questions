package com.ds.practice.array;

public class RotateArrayRightByN {

    public static void main(String[] args) {

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
        rotateArrayRightByN(arr, 1);

    }

    public static void rotateArrayRightByN(int[] arr, int rotation){

        // input  ->  1  2  3  4  5	 and rotate = 2
        // output ->  0  0  1  2  3
        int[] tempArray = new int[arr.length];
        int lengthArray = arr.length - 1;

        for (int i = 0; i <= arr.length - 1 ; i++) {
            int position = rotation + i;
            if( position <= lengthArray  ){
                tempArray[position] = arr[i];
            }else{
                int remRotation = rotation - (lengthArray - i);
                int calPosition = remRotation - 1;
                tempArray[calPosition] = arr[i];
            }
        }

        for (int i = 0; i <= tempArray.length -1; i++) {
            System.out.print(tempArray[i] + ", ");
        }
    }
}
