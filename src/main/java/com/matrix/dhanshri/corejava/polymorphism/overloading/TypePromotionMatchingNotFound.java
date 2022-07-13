package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class TypePromotionMatchingNotFound {

    public void m1(long a, long b){   // Matching not found
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TypePromotionMatchingNotFound t= new TypePromotionMatchingNotFound();
        t.m1(10, 10);
    }
}
