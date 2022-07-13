package com.matrix.dhanshri.corejava.constructorconcept;

public class PrivateConstructor {
    // only object call in same class for private constructor, not for other class

    private PrivateConstructor(){
        System.out.println("I am in private constructor");
    }

    /*protected PrivateConstructor(int a){
        System.out.println("I am in protected constructor");
    }*/

    /*public void PrivateConstructor(int a, int b){
    }If any return type then this is called as method with return type*/
    //method - with return type
    // constructor - no return type i.e. void


    public static void main(String[] args) {
        PrivateConstructor ch=new PrivateConstructor();

    }
}
