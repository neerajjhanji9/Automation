package com.matrix.pratap.corejava.variables;

public class StaticVariables {

    //static variables
    static int age = 10;

    //instance method
    public void getData() {
        //instance area - direct access
        System.out.println(age);
    }

    // static method
    public static void getData1() {
        //static area - direct access
        System.out.println(age);
    }

    public static void main(String[] args) {
        StaticVariables st = new StaticVariables();

        // 1. Direct access
        System.out.println(age);

        // 2. By using obj ref
        System.out.println(st.age);

        // 3. By using class name

        System.out.println(StaticVariables.age);

    }
}
