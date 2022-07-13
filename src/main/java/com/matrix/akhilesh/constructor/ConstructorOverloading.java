package com.matrix.akhilesh.constructor;

public class ConstructorOverloading {

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        obj.getData();

        new ConstructorOverloading().getData();
        new ConstructorOverloading(45,"Akhil").getData();
    }
    ConstructorOverloading(){
        System.out.println("I am a default constructor");
    }

    ConstructorOverloading(int age, String str){
        System.out.println("I am a parethenized constructor");
        System.out.println(age + str);
    }

    public void getData(){
        System.out.println("I am a method");
    }

}
