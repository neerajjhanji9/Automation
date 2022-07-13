package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class TypePromotionAmbiguity {

    public void m1(int a, long b){  // int, int
        System.out.println(a+b);
    }

    public void m1(long a, int b){  // int, int
        System.out.println(a+b);
    }

    public void m1(int ch){      // Not matching found, convert it char --> int
        System.out.println(ch);
    }

    public static void main(String[] args) {
        TypePromotionAmbiguity ob= new TypePromotionAmbiguity();
        //ob.m1(10, 10);  Ambiguity
        ob.m1('d');    // No matching found, then it will print ASCII codes
    }
}
