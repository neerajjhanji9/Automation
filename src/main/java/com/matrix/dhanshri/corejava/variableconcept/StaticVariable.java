package com.matrix.dhanshri.corejava.variableconcept;

public class StaticVariable {
    //static variable
    static int age=10;
    public void getData(){
        System.out.println(age); //Instace area direct access
    }
    //static method
    public static void getData1(){
        System.out.println(age); //static area direct access
    }

    public static void main(String[] args) {
        StaticVariable stv= new StaticVariable();
        System.out.println(age);               //1. direct access
        System.out.println(stv.age);           //2. by using object reference
        System.out.println(StaticVariable.age); // 3.  by using classname
    }
}
