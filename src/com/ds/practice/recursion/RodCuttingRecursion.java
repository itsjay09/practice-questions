package com.ds.practice.recursion;

public class RodCuttingRecursion {

    public static void main(String[] args) {
        //               1   2  3  4  5   6    7    8
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(maxValue(price));

    }


    public static int maxValue(int[] price) {
        int rodLength = price.length - 1;
        int maxPrice = 0;

        for (int i = 0; i < rodLength; i++) {

            int calPrice = price[i] + price[rodLength - (i + 1)];

            if (calPrice > maxPrice) {
                maxPrice = calPrice;
            }
        }

        return maxPrice;
    }
}
