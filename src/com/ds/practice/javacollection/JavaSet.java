package com.ds.practice.javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaSet {

    public static void main(String[] args) {
        Student student1 = new Student(1, "kalpesh");
        Student student2 = new Student(1, "kalpesh");
        System.out.println("student1 hashCode : " + student1);
        System.out.println("student2 hashCode : " + student2);

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        System.out.println(hashSet);

        Set<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(student1);
        linkedHashSet.add(student2);
        System.out.println(linkedHashSet);
    }
}
