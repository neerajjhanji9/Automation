package com.matrix.motilal.constructors;

public class TypesOfConstructors {
    int a;
    TypesOfConstructors(){  //Default Constructor
        System.out.println("Default Constructor : = "+this.a);
    }

    TypesOfConstructors(int a){  //Parameterized Constructor
        System.out.println("Parameterized Constructor : = "+(this.a=a));
    }

    public static void main(String[] args) {
        TypesOfConstructors t1=new TypesOfConstructors();
        TypesOfConstructors t2=new TypesOfConstructors(10);
    }
}
