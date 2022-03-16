package com.ds.practice.string;

import java.util.Arrays;

public class URUlify {

    static int MAX = 1000;

    public static void main(String[] args) {

        //It's often easiest to modify strings by going from the end of the string to the beginning.
        //You might find you need to know the number of spaces. Can you just count them?

        String str = "Mr John Smith      ";
        char[] chars = str.toCharArray();

        chars = replaceSpaces(chars);
        System.out.println(Arrays.toString(chars));


        // str = str.trim();
        //  str = str.replaceAll(" ", "%20");
        //  System.out.println(str);
    }

    protected static char[] replaceSpaces(char[] str) {

        int spaceCount = 0, i;
        //count the no of spaces in str
        for (i = 0; i < str.length; i++) {
            if(str[i] == ' '){
                spaceCount++;
            }
        }

        //calculate actual length
        while (str[ i -1] == ' '){
            spaceCount--;
            i--;
        }

        //define new length
        int newLength = i + spaceCount * 2;
        int index = newLength - 1;

        char[] oldChar = str;
        str = new char[newLength];

        for (int j = i - 1; j >= 0; j--) {
            if(oldChar[j] == ' '){
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }else{
                str[index] = oldChar[j];
                index--;
            }
        }
        return str;
    }
}
