package com.matrix.shailendra.variables;

public class InstanceVariables {
   // Instance Variables
    int a=45;
    int arr [] = {25,89};
    String str = "Shan";
    Double d = 23.56;
    char name = 'D';

    //method
    public void m1(){
        System.out.println(a);
    }

    // Instance method
    public void m4(){
        // Instance area
        System.out.println(name);// direct access
    }

    // static method
    public static void m2(){
        //static area - By using object reference
        InstanceVariables obj = new InstanceVariables(); // object creation
        System.out.println(obj.a);
        System.out.println(obj.str);
        System.out.println(obj.name);
        System.out.println(obj.d);

    }
    // constructor
    InstanceVariables(){
        System.out.println(name);
        System.out.println(a);
    }
    //blocks
    {
        System.out.println(str);
        System.out.println(arr);
    }

    public static void main(String[] args) {

    }
}
