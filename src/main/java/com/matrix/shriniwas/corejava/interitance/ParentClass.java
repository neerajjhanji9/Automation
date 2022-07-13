package com.matrix.shriniwas.corejava.interitance;

public class ParentClass {
    int a;
    String name;

    public ParentClass() {
        System.out.println("Parent class constructor");
        a = 10;
        name = "Shriniwas";
    }

    public ParentClass(int rollNo) {
        this();
        System.out.println(rollNo);
    }

    public ParentClass(int rollNo, String str) {
        this(10);
    }
}
