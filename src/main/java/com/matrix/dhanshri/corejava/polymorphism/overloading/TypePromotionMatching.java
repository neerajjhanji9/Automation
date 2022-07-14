package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class TypePromotionMatching {

    public void m1(int a, int b){   // Matching found
        System.out.println(a+b);
    }

    public void m1(long a, long b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TypePromotionMatching tp= new TypePromotionMatching();
        tp.m1(10, 20);       // match found

    }
}
