package com.matrix.jayesh.finalKeywords;

public class FinalVeriable {

    final static int VALUEIS = 10;

    public void display(){
        // VALUEIS = 50; // Cannot assign a value to final variable 'VALUEIS'
        System.out.println("value is = "+VALUEIS);
    }
    public static void main(String[] args) {
        FinalVeriable obj = new FinalVeriable();
        obj.display();
    }
}
