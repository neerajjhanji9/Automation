package com.matrix.juhi.constructor;

public class ConstructorOverloading {

    int i;
    String name;

    ConstructorOverloading(String name){
        System.out.println("constructor with param" + name);
    }
    ConstructorOverloading(int a, String b){
        i = a;
        name = b;
        System.out.println("constructor with 2 param" + a + b);
    }

    public static void main(String[] args) {
        ConstructorOverloading d1 = new ConstructorOverloading("juhi");
        ConstructorOverloading d2 = new ConstructorOverloading(20,"anil");
    }
}


