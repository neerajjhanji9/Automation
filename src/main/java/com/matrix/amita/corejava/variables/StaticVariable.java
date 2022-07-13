package com.matrix.amita.corejava.variables;

public class StaticVariable {

    // static variable
    static int age = 10;

    // instance method
    public void getData() {
        // instance area
        System.out.println(age);
    }

    // static method
    public static void getData1() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        StaticVariable st = new StaticVariable();
       // 1.Direct Access
        System.out.println(age);

       // 2. By using object reference
        System.out.println(st.age);

        // 3. by using class name
        System.out.println(StaticVariable.age);
    }
}
