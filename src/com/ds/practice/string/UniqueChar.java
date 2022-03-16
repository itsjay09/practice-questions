package com.ds.practice.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

    public static void main(String[] args) {
        String str = "Jaya";
        boolean hasUniqueChar = isUniqueChars(str);
        System.out.println("hasUniqueChar : " + hasUniqueChar);
    }

    public static boolean hasUniqueChar(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean hasUniqueChar2(String str) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!chars.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public  static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {//Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
