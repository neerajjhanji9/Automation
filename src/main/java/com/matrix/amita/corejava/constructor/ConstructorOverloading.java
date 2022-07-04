package com.matrix.amita.corejava.constructor;

public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println("Without Parameter");
    }

    ConstructorOverloading(int a, int b){
        System.out.println("With Parameter");
        System.out.println(a + b);
    }

    public void getData(){

    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(12, 13);
    }
}
