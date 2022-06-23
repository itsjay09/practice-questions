package com.ds.practice.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        //String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer" };
        String[] arr = {"lapple", "pape", "hapril" };
        String s = checkCommonPrefixApp2(arr, arr.length);
        System.out.println(s);
    }

    private static String checkCommonPrefixApp2(String[] arr, int n) {
        int minLength = minLength(arr, n);
        String strRet = "";
        char curr;
        // mim length char iteration
        for (int i = 0; i < minLength; i++) {
            curr = arr[0].charAt(i);
            // String iteration
            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != curr) {
                    if(strRet.isEmpty()){
                        return String.valueOf(-1);
                    }
                    return strRet;
                }
            }
            strRet += curr;
        }
        return strRet;
    }

    private static int minLength(String[] arr, int n) {
        int minLength = arr[0].length();
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < minLength) {
                minLength = arr[i].length();
            }
        }
        return minLength;
    }


    // Approche 1
    // String by String matching
    private static String checkCommonPrefix(String[] arr, int n) {
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            prefix = checkCommonOfString(arr[i], prefix);
        }
        return prefix;
    }

    private static String checkCommonOfString(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        String strRet = "";
        for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            strRet += str1.charAt(i);
        }
        return strRet;
    }
}
