package com.ds.practice.array;

public class MaximumDifference {

    public static void main(String[] args) {
        MaximumDifference maxdif = new MaximumDifference();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " +
                maxdif.maxDiff1(arr, size));
    }

    private int maxDiff1(int[] arr, int size) {
        int maxDiff = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if(arr[j] > arr[i]){
                    if(arr[j] - arr[i] > maxDiff){
                        maxDiff = arr[j] - arr[i];
                    }
                }else{
                    if(arr[i] - arr[j] > maxDiff){
                        maxDiff = arr[i] - arr[j];
                    }
                }
            }
        }
        return maxDiff;
    }

    private int maxDiff(int[] arr, int size) {
        int maxDiff = arr[0] - arr[1];
        int minDiff = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] - minDiff > maxDiff){

            }

        }
        return maxDiff;
    }


}
