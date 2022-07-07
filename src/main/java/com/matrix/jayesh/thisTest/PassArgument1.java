package com.matrix.jayesh.thisTest;

public class PassArgument1 {
    PassArgument obj;
    PassArgument1(PassArgument obj){
        this.obj = obj;
    }

    public void display(){
        System.out.println(obj); // com.matrix.jayesh.thisTest.passArgument@4554617c
        System.out.println(obj.test); //50
    }
}
