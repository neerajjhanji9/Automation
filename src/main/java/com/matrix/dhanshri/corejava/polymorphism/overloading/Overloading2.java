package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class Overloading2 {
    public void getDetails(int age, String name, int rollno){
        System.out.println("Age is: "  +age+ " Name is "   +name+  " RollNo is: "  +rollno);

    }
    public void getDetails(String s, int age){
        System.out.println("My name is "  +s +" Age is: "    +age);
    }

    public static void main(String[] args) {
        Overloading2 o2= new Overloading2();
        o2.getDetails("Dhanashri", 15);
        o2.getDetails(20, "Dhanu", 5);

    }

}
