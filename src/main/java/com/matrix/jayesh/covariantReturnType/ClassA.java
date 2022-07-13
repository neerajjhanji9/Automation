package com.matrix.jayesh.covariantReturnType;

public class ClassA extends ClassB{
    @Override
    ClassA foo(){
        super.foo(); // call class b method
        int result = super.display();
        System.out.println(result);

        System.out.println("Class A");
        return this; // same as new ClassA();
        // it overwrite the return type like as int, string from another call
    }


}
