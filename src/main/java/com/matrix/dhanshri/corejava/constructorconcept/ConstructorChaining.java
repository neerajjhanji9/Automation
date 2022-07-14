package com.matrix.dhanshri.corejava.constructorconcept;

public class ConstructorChaining {

    ConstructorChaining(){
        //this();
        System.out.println("I am in no param-constructor");
    }

    ConstructorChaining(int a, int b){
        this("Dhanashri");
        System.out.println("I am in param-constructor");
    }

    ConstructorChaining(String name){
        System.out.println("I am in param constructor  :"    +  name);
    }


    public static void main(String[] args) {
        new ConstructorChaining(10, 20);

    }
}
