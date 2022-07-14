package com.matrix.jayesh.abstractTest;

public class TestMainClassA {
    public static void main(String[] args) {
        AbstructClassA obj = new TestClassB();

        int result = obj.addTwoNumbers(20,30); // overloading
        System.out.println(result);

        int result1 = obj.addTwoNumbers(); // overloading
        System.out.println(result1);
    }
}
