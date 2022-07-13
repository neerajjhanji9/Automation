package com.matrix.shriniwas.corejava.polymorphism.overloading;

public class OverloadingTypePromotionAmbiguity {

    public void m1(int a, long b) { // int, int
        System.out.println(a + b);
    }

    public void m1(long a, int b) { // int, int
        System.out.println(a + b);
    }

    public void m1(int c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        OverloadingTypePromotionAmbiguity obj = new OverloadingTypePromotionAmbiguity();
        // obj.m1(10, 10); // Ambiguity

        obj.m1('z'); // It will print ascii (American Standard Code for Information Interchange) value
    }
}
