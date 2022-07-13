package com.matrix.gayathri.oops.inheritance;
class Parent2{
  public Parent2(){
        this(2);   // this(2) calls current class params constructor
        System.out.println("Parent no args Constructor");
    }
    public Parent2(int roll){
        System.out.println(roll + " Parent one param Constructor");
    }
}
class Child2 extends Parent2{
   public Child2(){
        //super(); will be added by default by compiler  ; super(10) can be given to access param constructor
        System.out.println("Child no args Constructor");
    }

    public static void main(String[] args) {
        Child2 ch = new Child2();
    }
}

public class TestInheritanceConstructors {
}
