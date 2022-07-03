package com.matrix.dhanashri.corejava.constructorconcept;

public class InstanceBlock {
    int a=200;

      ///Instance block
    {
      a= 10;
        System.out.println("This is an Instance block");
    }


    // Constructor below::
    InstanceBlock(){
        System.out.println("I am in Constructor");
        System.out.println("value of a:  "    +a);
    }

    InstanceBlock(int age){
        System.out.println(" My age is  : "     +age);
    }

    public static void main(String[] args) {
        InstanceBlock ib= new InstanceBlock();
        System.out.println("_______________________");
        InstanceBlock ib1= new InstanceBlock(25);
    }
}