package com.matrix.shriniwas.corejava.polymorphism.overloading;

public class OverloadingTypePromotionMatchingNotFound {

    public void m1(long c, long d) {
        System.out.println(c + d);
    }

    public static void main(String[] args) {
        OverloadingTypePromotionMatchingNotFound obj = new OverloadingTypePromotionMatchingNotFound();
        obj.m1(10, 10);
    }

}
