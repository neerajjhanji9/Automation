package com.matrix.rahuly.constructor;

public class Student {

    int seatNo;
    String name;

    public Student() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sub marks of rahul:" + c);
    }

    public Student(int seat, String nm) {
        this.seatNo = seat;
        this.name = nm;
        System.out.println(seat);
        System.out.println(nm);

    }

    public static void main(String[] args) {
        new Student();
        new Student(12, "Spice jet flight");
        Student st2 = new Student();
        Student st3 = new Student(10, "Air India");

    }
}
