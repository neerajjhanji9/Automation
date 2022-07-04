package com.matrix.jayesh.thisTest;

public class instanceVariableTest {
    //Rule: Call to this() must be the first statement in constructor.

    int rollno = 10;
    String str = "Jayesh";
    instanceVariableTest(){
        this(50); // Calling constructor //chanining of constructor
        this.rollno = rollno;
        this.str = str; // used as instance veriable
        // we can used rollNo = rollno.
    }

    instanceVariableTest(int i){
        System.out.println("Should display ="+i);
    }



    void m(){
        System.out.println("This extent");
    }
    public void display(){
        this.m();  // calling method m // chanining of method
        System.out.println(rollno +" "+ str);

    }
    public static void main(String[] args) {
        instanceVariableTest obj = new instanceVariableTest();
        obj.display();

    }
}
