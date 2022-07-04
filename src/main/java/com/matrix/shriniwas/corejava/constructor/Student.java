package com.matrix.shriniwas.corejava.constructor;

public class Student {

    int rollNo;
    String name;

    // Parameterized constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }

    // no-args constructor
    public Student() {
        System.out.println("I am in Constructor");
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Shri1");
        Student s2 = new Student(20, "Shri2");
        Student s3 = new Student(30, "Shri3");

        Student s4 = new Student();
    }

}
