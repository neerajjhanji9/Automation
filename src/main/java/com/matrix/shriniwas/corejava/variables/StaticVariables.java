package com.matrix.shriniwas.corejava.variables;

public class StaticVariables {

    // Static variable
    static int age = 10;

    // Instance method
    public void getData() {
        // Instance Area - Direct access
        System.out.println(age);
    }

    // Static method
    public static void getData1() {
        // Static Area - Direct access
        System.out.println(age);
    }

    public static void main(String[] args) {
        StaticVariables st = new StaticVariables();
        // 1. Direct Access
        System.out.println(age);

        // 2. By using object reference
        System.out.println(st.age);

        // 3. By using class name
        System.out.println(StaticVariables.age);
    }
}
