package com.matrix.mohita.methods;

public class MultipleParameters {
    public static void combo(String name, int age){
        System.out.println(name + "is" + age);
    }

    public static void main(String[] args) {
        combo("Eleven",50);
        combo("Steve",45);
        combo("Billy",30);
        combo("Mike", 27);
    }
}
