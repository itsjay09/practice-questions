package com.ds.practice.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String a = "jayesh";
        String b = "sheyaj";
        System.out.println(isAnagram(a, b));
    }


    public static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }

        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != brr[i]){
                return false;
            }
        }
        return true;
    }
}
