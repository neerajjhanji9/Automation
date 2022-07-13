package com.matrix.shriniwas.corejava.polymorphism.overloading;

public class OverloadingTypePromotionMatchingFound {

    public void m1(int a, int b) { // Matching Found int, int
        System.out.println(a + b);
    }

    public void m1(long c, long d) {
        System.out.println(c + d);
    }

    public static void main(String[] args) {
        OverloadingTypePromotionMatchingFound obj = new OverloadingTypePromotionMatchingFound();
        obj.m1(10, 10);
    }

}
