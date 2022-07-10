package com.matrix.pratap.corejava.variables;

public class InstanceVariables {

    int age = 10;
    String str = "Pratapsinh";
    int arr [] = {10, 20};
    boolean b = true;

    public  void m1(){
        System.out.println(age);
    }

   public  void m2(){
       System.out.println(str);
   }

   public static void m3(){
        InstanceVariables obj = new InstanceVariables();
       System.out.println(obj.age);
       System.out.println(obj.str);
       System.out.println(obj.arr);
       System.out.println(obj.b);

   }

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        obj.m2();  // method calling by Obj ref
        InstanceVariables.m3(); // method calling by using class Name

    }
}
