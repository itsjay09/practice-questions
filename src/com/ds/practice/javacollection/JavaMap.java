package com.ds.practice.javacollection;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {
        Student student1 = new Student(1, "kalpesh");
        Student student2 = new Student(1, "kalpesh1");

        student2.hashCode();

        System.out.println("student1 hashCode : " + student1);
        System.out.println("student2 hashCode : " + student2);

        Map<Student, Integer> map = new HashMap<>();
        map.put(null, 12);
        //   map.put(null, 15);
        System.out.println(map);


        System.out.println(map.containsKey(null));

        int str = Integer.parseInt("0001234");
    }
}
