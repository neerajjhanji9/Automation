package com.matrix.gayathri.constructors;

public class ConstructorOverloading {

    public ConstructorOverloading(){
        System.out.println("Im in no-args Constructor");

    }

    public ConstructorOverloading(int num, String name){
        System.out.println("im in parameterized Constructor");
    }

    public void getData(){
        System.out.println("Im in method");

    }

    public static void main(String[] args) {
        /* Ways of object creation
         * 1. Named object
              used by referring obj1 and using multiple times*/
        ConstructorOverloading obj1 = new ConstructorOverloading();
        obj1.getData();

        //2.Nameless object   (for one time use)
        new ConstructorOverloading(20,"Nameless Object");

        //3. Named object    (Declared at class level, can be assigned elsewhere)
        ConstructorOverloading obj2;
        obj2 = new ConstructorOverloading();

    }
}
