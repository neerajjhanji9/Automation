package com.matrix.shriniwas.corejava.polymorphism.overloading;

public class Overloading3 {

    public void m1(int age, String name) {
        System.out.println(age + "---" +name);
    }

    public void m1(String name, int age) {
        System.out.println(name + "---" +age);
    }

    public void m1(int [] arr, String [] strArr) {
        for (String str: strArr) {
            System.out.println(str);
        }

        for (int i: arr) {
            System.out.println(i);
        }
    }

    public void m1(Student st) {
        System.out.println(st.rollNumber);
        System.out.println(st.studentName);
    }

    public int m1() {
        return 10;
    }

    public static void main(String[] args) {
        Overloading3 obj = new Overloading3();
        obj.m1(10, "Shriniwas");
        obj.m1("Shriniwas", 10);

        int [] arr = {10, 20, 30};
        String [] strArr = {"Shri1", "Shri2", "Shri3"};

        obj.m1(arr, strArr);

        Student st = new Student();

        obj.m1(st);

        System.out.println("Value from m1(): " +obj.m1());
    }
}
