package com.matrix.dhanshri.corejava.constructorconcept;

public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println("I am in Default Constructor");
    }

    ConstructorOverloading(int age, String name){
        System.out.println("I am in Parameterized Constructor");
        System.out.println(age  + "......"   + name);
    }
    public void getData(){
        System.out.println("I am in method");
    }


    public static void main(String[] args) {

        ConstructorOverloading ob1= new ConstructorOverloading();// naming object
        ob1.getData();
        ConstructorOverloading ob2= new ConstructorOverloading();

        new ConstructorOverloading().getData(); // nameless object
        new ConstructorOverloading( 25, "Dhanshri");

    }
}
