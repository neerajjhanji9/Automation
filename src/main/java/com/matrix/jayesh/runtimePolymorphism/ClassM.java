package com.matrix.jayesh.runtimePolymorphism;

public class ClassM extends ClassX{

    public static void main(String[] args) {
       // ClassX obj = new ClassM(); // here parent class and child constructor  //upcasting
       // obj.set();

        ClassN obj = new ClassX(); // Test class x  //upcasting
        // Dynamic binding, run-time object, Late Binding
        obj.set();
    }

}