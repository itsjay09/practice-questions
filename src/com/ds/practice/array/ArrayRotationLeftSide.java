package com.ds.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRotationLeftSide {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int steps = 4;

        System.out.println("Before :-> " + Arrays.toString(array));

        int[] tempArray = arrayRotationLeftSideByN(array, steps, array.length);

        System.out.println("After :-> " + Arrays.toString(tempArray));
    }

    private static int[] arrayRotationLeftSideByN(int[] array, int d, int n) {
        int[] tempArray = new int[n];
        int length = n;
        int currIndex = length - 1;

        while (currIndex >= 0) {
            if ((currIndex - d) < 0) {
                int indexToAdd = length - (d - currIndex);
                tempArray[indexToAdd] = array[currIndex];
            } else {
                tempArray[currIndex - d] = array[currIndex];
            }
            currIndex--;
        }
        return tempArray;
    }
}
