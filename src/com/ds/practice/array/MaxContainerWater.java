package com.ds.practice.array;

public class MaxContainerWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxContainerWater(height, height.length);
        System.out.println(maxArea);
    }

    // Time Complexity O(n^2)
    public static int maxContainerWater(int[] array, int n) {
        int maxArea = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = 0, len = 0;
                int minHeight = Math.min(array[i], array[j]);
                if (len > maxLength && area > maxArea) {
                    maxLength = len;
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    // Time Complexity O(n) with tow pointer technique
    public int getContainerMaxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int lPointer = 0, rPointer = n - 1;

        while (lPointer < rPointer) {
            int minHeight = Math.min(height[lPointer], height[rPointer]);
            int len = rPointer - lPointer;
            int area = minHeight * len;
            maxArea = Math.max(area, maxArea);
            if (lPointer < rPointer)
                lPointer++;
            else
                rPointer++;
        }
        return maxArea;
    }
}
