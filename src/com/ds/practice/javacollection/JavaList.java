package com.ds.practice.javacollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaList {

    public static void main(String[] args) {

        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "kalpesh"));
        arrayList.add(new Student(2, "test"));

        Map<Integer, Student> collect = arrayList.stream()
                .filter(emp -> emp.id > 0)
                .collect(Collectors.toMap(s -> s.id, s -> s));

        System.out.println(collect);

    }
}
