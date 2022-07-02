package com.matrix.dhanashri.corejava.MethodsConcept;

public class MethodWithMultipleParam {

    public void addtion(int a, int b){
        System.out.println("Addition of a and b  :"  +(a+b));
    }
    public void multiply(int a, int b){
        System.out.println("Multiplication of a and b is :"  +(a*b));
    }

    public static void add(int a, int b, int c){
        System.out.println(" Addition of all are  :"   +(a+b+c));
    }

    public void getName(){
        String name="Dhanashri";
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodWithMultipleParam mp1= new MethodWithMultipleParam();
        mp1.addtion(20, 30);
        System.out.println("--------------------------------------");
        mp1.add(100, 200, 300);
        System.out.println("--------------------------------------");
        mp1.getName();
        System.out.println("---------------------------------------");
        mp1.multiply(20, 30);
    }
}

