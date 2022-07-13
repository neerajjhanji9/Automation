package com.matrix.amita.corejava.constructor;

public class ConstructorOverloading {

    ConstructorOverloading(){  // same constructor name but diff actions
        System.out.println("Without Parameter");
    }

    ConstructorOverloading(int a, int b){
        System.out.println("With Parameter");
        System.out.println(a + b);
    }

    public void getData(){
        System.out.println("I am Amita");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj=new ConstructorOverloading();
        obj.getData();
        new ConstructorOverloading().getData();
        new ConstructorOverloading(12, 13).getData();
    }
}
