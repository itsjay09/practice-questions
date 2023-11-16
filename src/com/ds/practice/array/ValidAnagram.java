package com.ds.practice.array;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(checkIfValidAnagram2(s, t));
    }

    public static boolean checkIfValidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < s.length(); i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }

    //count char in string and store
    // check the both count from both Map
    public static boolean checkIfValidAnagram2(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int cnt : count) {
            if (cnt != 0) return false;
        }

        return true;
    }
}
