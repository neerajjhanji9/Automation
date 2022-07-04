package com.matrix.gayathri.methods;

public class MultipleParameters {

    public static void combo(String name,int age){
        System.out.println(name + " is "+ age);
    }

    public static void main(String[] args) {
        combo("John",50);
        combo("Mary",45);
        combo("Tom",30);
        combo("lara",27);
    }
}
