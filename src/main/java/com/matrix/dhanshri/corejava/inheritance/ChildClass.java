package com.matrix.dhanshri.corejava.inheritance;

public class ChildClass extends ParentClass{
    int a =10;
    int b= 20;

    public void getData(){
        System.out.println(a+b);
        System.out.println(x+y);
    }
    public void getDetails(){
        System.out.println(this.a+this.b); // this is used for current class
        System.out.println(x+y);
        System.out.println(super.a+super.b); // super is used for parent class
    }

    public static void main(String[] args) {
        ChildClass ch1= new ChildClass();
        ch1.getData();
        ch1.getDetails();
    }
}
