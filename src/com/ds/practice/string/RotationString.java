package com.ds.practice.string;

public class RotationString {

    public static void main(String[] args) {

        String a = "fsbcnuvqhffbsaqxwp";
        String b = "wpfsbcnuvqhffbsaqx";

        System.out.println(isRotated(a, b));

    }

    // j a y e s h
    // s h j a y e
    public static boolean isRotated(String str1, String str2) {

        char[] charArray = str1.toCharArray();
        String newStr  = clockWiseRotate(charArray, str1.length());
        String newStr2  = antiClockWiseRotate(charArray, str1.length());

        if (newStr.equals(str2) ||  newStr2.equals(str2)) {
            return true;
        }
        return false;
    }

    public static String clockWiseRotate(char[] charArray, int length){
        int step = 2;
        char[] newArray = new char[length];
        for (int i = charArray.length - 1; i >= 0; i--) {
            if ( i < step) {
                int diff = step - i;
                int index = charArray.length - diff;
                newArray[index] = charArray[i];
            } else {
                newArray[i - 2] = charArray[i];
            }
        }
        return new String(newArray);
    }

    public static String antiClockWiseRotate(char[] charArray, int length){
        int step = 2;
        char[] newArray = new char[length];
        for (int i = 0; i < charArray.length; i++) {
            if ( i + 2 < charArray.length)  {
                newArray[i + 2] = charArray[i];
            } else {
                int diff = charArray.length - i;
                int index = step - diff ;
                newArray[index] = charArray[i];
            }
        }
        return new String(newArray);
    }


}
