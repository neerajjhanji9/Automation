package com.matrix.jayesh.overRidingMethod;

public class OverridingMethod {
    public static void main(String[] args) {
        Test1 obj1 = new Test1();
        System.out.println(obj1.add(10, 20));

        Test2 obj2 = new Test2();
        System.out.println(obj2.add(5));

    }
}
