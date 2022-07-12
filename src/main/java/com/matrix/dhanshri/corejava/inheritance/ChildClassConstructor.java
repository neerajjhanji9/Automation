package com.matrix.dhanshri.corejava.inheritance;

public class ChildClassConstructor extends ParentClassConstructor{
    public ChildClassConstructor(){
        super(20);// super will be added by compiler as a 1st statement, if not parameterized then default constructor of parent class accessed
        System.out.println("This is Child class constructor ");
        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) {
        ChildClassConstructor co1= new ChildClassConstructor();

    }
}