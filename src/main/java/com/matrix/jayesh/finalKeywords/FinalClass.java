package com.matrix.jayesh.finalKeywords;

public class FinalClass{
    public static void main(String[] args) {

    }
}

/* public class FinalClass extends FinalMethodAB{
    //Cannot inherit from final 'com.matrix.jayesh.finalKeywords.FinalMethodAB'
    public static void main(String[] args) {

    }
} */

/**
 * A static final variable that is not initialized at the time of declaration is known as static blank final variable.
 * It can be initialized only in static block.
 *class A{
 *   static final int data;//static blank final variable
 *   static{ data=50;}
 *   public static void main(String args[]){
 *     System.out.println(A.data);
 *  }
 * }
 *
 *
 * Q) Can we declare a constructor final?
 * No, because constructor is never inherited.
 *
 * **/
