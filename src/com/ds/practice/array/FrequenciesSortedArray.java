package com.ds.practice.array;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesSortedArray {

    public static void main(String[] args) {

    }

    public static void maxFriquencies(int[] arr, int length){
        Map<Integer, Integer> map = new HashMap<>();

        for(int  i = 0; i <= 0; i++ ){

            if(map.containsKey(arr[i])){
                int sum = map.get(i) + 1;
                map.put(arr[i], sum);
            }else{
                map.put(arr[i], 1);
            }
        }
    }

}
