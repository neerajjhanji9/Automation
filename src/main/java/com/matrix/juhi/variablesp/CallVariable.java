package com.matrix.juhi.variablesp;

public class CallVariable {

    //Local Variable - present inside the class , constructor and block
    public void idea (){
        float g = 25;
        System.out.println(g/2);
    }

    public static void main(String[] args) {
        CallVariable e = new CallVariable();
        e.idea ();
    }
}
