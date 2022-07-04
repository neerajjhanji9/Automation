package com.matrix.jayesh.inheritance;

public class Subclass extends Superclass{
    // grop of object which has comman property.
    // derived class, extended class, or child class.
    // also call as Is-A relationship
    // Note: Multiple inheritance is not supported in Java through class.


    //Why multiple inheritance is not supported in java?
    // ans - To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
    // it through  = Compile Time Error

    public static void main(String[] args) {
        Superclass obj = new Superclass();
        int rollNo1 = obj.rollNo;
        System.out.println(rollNo1);
        System.out.println(obj.displayRollNo());
        System.out.println(obj.getStr());

        // multilevel inheristance
        obj.getSuperClassNext();
    }
}
