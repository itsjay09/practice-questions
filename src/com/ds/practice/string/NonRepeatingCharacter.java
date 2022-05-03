package com.ds.practice.string;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("hello"));


    }

    public static Character nonRepeatingCharacter(String S) {

        int[] count = new int[26];
        for (char ch : S.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : S.toCharArray()) {
            if (count[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '$';
    }
}
