package com.matrix.jayesh.thisTest;

public class printReference {
    /**
     * printReference@4554617c
     * class name @
     *
     * */
    void methodM(){
        System.out.println(this); //com.matrix.jayesh.thisTest.printReference@4554617c
    }
    public static void main(String[] args) {
        printReference obj = new printReference();
        System.out.println(obj); // com.matrix.jayesh.thisTest.printReference@4554617c
        obj.methodM();
    }



}
