package com.matrix.shriniwas.corejava.variables;

public class InstanceVariables {

    // Instance variables
    int age = 10;
    String str = "Shriniwas";
    int [] ar = {10, 20};
    boolean b = true;

    public void m1() {
        System.out.println(age);
    }

    // Instance method
    public void m2() {
        // Instance area - Direct access
        System.out.println(age);
    }

    // Static method
    public static void m3() {
        // Static area - By using object reference/variable
        InstanceVariables o = new InstanceVariables(); // Object creation
        System.out.println(o.age);
        System.out.println(o.str);
        System.out.println(o.b);
        System.out.println(o.ar);
    }

//    InstanceVariables() {
//        System.out.println(age);
//    }

//    {
//        System.out.println(age);
//    }

    public static void main(String[] args) {

    }
}
