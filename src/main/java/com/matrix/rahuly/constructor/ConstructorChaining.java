package com.matrix.rahuly.constructor;

public class ConstructorChaining {

        ConstructorChaining() {
            System.out.println("I am in default constructor");
        }

        ConstructorChaining(int a, int b){
            this();
            System.out.println("I am in param constructor");
        }

        ConstructorChaining(String name) {
            this(19,20);
            System.out.println("I am in Constructor chaining");
        }

        void getDetails() {
            System.out.println("------");
        }

    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining("Rahul");
        c.getDetails();
        new ConstructorChaining(20,10);

    }
}
