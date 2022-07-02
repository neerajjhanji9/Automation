package com.matrix.dhanashri.corejava.VariableConcept;

public class InstanceVariables {
    int age=20;
    String str="Dhanashri";
    int [] arr= {20, 30};
    boolean b= true;

    public void m1(){
        System.out.println(age);
    }
     //Instance area
    public void m2(){
        System.out.println(age); //direct access
    }
    public static void m3(){
        // Static area - By using object reference/variable
        InstanceVariables ob= new InstanceVariables();
        System.out.println(ob.age);
        System.out.println(ob.arr);
        System.out.println(ob.b);
        System.out.println(ob.str);
    }

    public static void main(String[] args) {

    }
}
