package com.ds.practice.string;

public class ValidSubstring {

    public static void main(String[] args) {
        String S ="(()(";
        int maxLen = findMaxLen(S);
        System.out.println(maxLen);
    }

    private static int findMaxLen(String S) {
        int open = 0, close = 0, max = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') open++;
            else close++;
            if (open == close) max = Math.max(max, open + close);
            else if(close > open) open = close = 0;
        }
        open = close = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '(') open++;
            else close++;
            if (open == close) max = Math.max(max, open + close);
            else if(close < open) open = close = 0;
        }
        return max;
    }
}
