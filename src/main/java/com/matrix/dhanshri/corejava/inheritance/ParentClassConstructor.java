package com.matrix.dhanshri.corejava.inheritance;

public class ParentClassConstructor {
    int a;
    String name;

    public ParentClassConstructor(){
        System.out.println("This is Parent class constructor");
        a=100;
        name="Dhanu";
    }

    public ParentClassConstructor(int rollNo){
        this(); // if parametrized constructor calling 1st in child, then in parent class this() is used
        //super();
        System.out.println("My Roll no. is 20");
    }
}
