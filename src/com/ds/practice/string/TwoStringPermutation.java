package com.ds.practice.string;

import java.util.Arrays;

public class TwoStringPermutation {

    public static void main(String[] args) {
        String str1 = "lpeka";
        String str2 = "kalpe";
        boolean isPermutation = isPermutation(str1, str2);
        System.out.println("isPermutation: "+ isPermutation);
    }

    public static boolean isPermutation(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        if(l1 != l2){
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < l1; i++) {
            if(ch1[i] != ch2[i]){
                return false;
            }
        }

        return true;
    }
}
