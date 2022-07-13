package com.matrix.amita.corejava.constructor;

public class ConstructorChaining {

    ConstructorChaining(String Name, String Name2){
        this(); // it will 0-param constructor... this. = this refers to current class instance
        System.out.println("With Parameter");
    }

    ConstructorChaining(){
        this("Lavanya");  // it will refers to single param constructor
        System.out.println("Without Parameter");
    }

    ConstructorChaining(String Name){
        System.out.println("With Single Parameter");
    }

    public static void main(String[] args) {
        new ConstructorChaining("Amita", "Shri");
    }
}
