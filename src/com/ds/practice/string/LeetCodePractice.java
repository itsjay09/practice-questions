package com.ds.practice.string;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePractice {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5 ,6};
        int target = 2;
        searchInsert(arr, target);
    }


    public static int searchInsert(int[] nums, int target) {

        boolean found = false;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                found = true;
                break;
            }
        }

        if(found){
            return index;
        }else{
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > target){
                    index = i;
                    found = true;
                    break;
                }
            }
            if(found){
                return index;
            }else{
                return nums.length;
            }
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> mainList = new  ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++ ){

            boolean flag = true;
            Inn:
            for(int j = 0; j < nums2.length; j++ ){
                if(nums1[i] == nums2[j]){
                    flag = false;
                    break Inn;
                }
            }
            if(flag){
                list1.add(nums1[i]);
            }
        }

        mainList.add(list1);
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++ ){
            boolean flag = true;
            Inn2:
            for(int j = 0; j < nums1.length; j++ ){
                if(nums2[i] == nums1[j]){
                    flag = false;
                    break Inn2;
                }
            }
            if(flag){
                list2.add(nums2[i]);
            }
        }

        mainList.add(list2);

        return mainList;
    }

}
