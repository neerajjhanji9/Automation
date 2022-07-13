package com.matrix.Vipin.variable;

public class StaticVariable {

    //Static Variable
    static int age = 10;

    //instance method

    public void getData() {
        //instance area
        System.out.println(age);

    }
    //Static method
    public static void getData2() {
        //Static area
        System.out.println(age);

    }

    public static void main(String[] args) {
        StaticVariable st = new StaticVariable();
        //1.direct access
        System.out.println(age);
        //2.by using object refrence
        System.out.println(st.age);

        //3. by using class name
        System.out.println(StaticVariable.age);

    }
}
