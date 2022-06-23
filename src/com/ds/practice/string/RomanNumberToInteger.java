package com.ds.practice.string;

public class RomanNumberToInteger {

    public static void main(String[] args) {
        String val = "XXIII";
        System.out.println(romanToDecimal(val));
    }

    private static int romanToDecimal(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int value = getValue(str.charAt(i));
            if( i + 1 < str.length()){
                if(getValue(str.charAt(i + 1)) > value){
                    result -= value;
                }else{
                    result += value;
                }
            }else{
                result += value;
            }
        }
        return result;
    }

    private static int getValue(char ch){
        if(ch == 'I')
            return 1;
        if(ch == 'V')
            return 5;
        if(ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return -1;
    }
}
