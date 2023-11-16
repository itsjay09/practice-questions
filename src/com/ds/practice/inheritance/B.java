package com.ds.practice.inheritance;

public class B extends A {

    public void printMessage() {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        A a = new A();
        a.printMessage();
    }
}
