package com.matrix.gayathri.methods;

public class SameSignatureMethods {

    public static void m1(char c) {
        System.out.println(c);
    }

   /*   Methods with same signature are not allowed
    public static void m1(char ch){
      *  System.out.println(ch);
         }    */


    public static void main(String[] args) {
       m1('G');
    }
}

