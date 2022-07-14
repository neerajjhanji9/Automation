package com.matrix.shriniwas.corejava.polymorphism.overriding;

public class OverridingChild1 extends OverridingParent1 {

    @Override
    public void m1() {
        System.out.println("Child:: m1 method");
    }

    @Override
    public void marry() {
        System.out.println("Marry GF");
    }

    public void m3(int age) {
        System.out.println("Child Class::" +age);
    }

    public static void main(String[] args) {

        // 1. Parent ref, Parent object
        OverridingParent1 obj1 = new OverridingParent1();
       // obj1.m1();

        // Compiler will check if m1() method is present in OverridingParent1 class or not
        // If it is present, then JVM will call the method of whoever class object is created

        // 2. OverridingChild1 ref, OverridingChild1 object
        OverridingChild1 obj2 = new OverridingChild1();
        //obj2.m1(); // It will call child class m1 method
        //obj2.marry(); // // It will call child class marry method
        //obj2.m2(); // It will call Parent class m2 method
        // obj2.m3(10); // It will call child class m3 method

        // 3. OverridingParent1 ref, OverridingChild1 object
        OverridingParent1 obj3 = new OverridingChild1();
        obj3.m1();
        // Compiler will check if m1() method is present in OverridingParent1 class or not
        // If it is present, then at runtime JVM will call the method of whoever class object is created

        // 4. OverridingChild1 ref, OverridingParent1 object
        // OverridingChild1 obj4 = new OverridingParent1(); // This is not possible
    }
}
