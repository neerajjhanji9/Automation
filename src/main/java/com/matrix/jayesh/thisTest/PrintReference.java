package com.matrix.jayesh.thisTest;

public class PrintReference {
    /**
     * printReference@4554617c
     * class name @
     *
     * */
    void methodM(){
        System.out.println(this); //com.matrix.jayesh.thisTest.printReference@4554617c
    }
    public static void main(String[] args) {
        PrintReference obj = new PrintReference();
        System.out.println(obj); // com.matrix.jayesh.thisTest.printReference@4554617c
        obj.methodM();
    }



}
