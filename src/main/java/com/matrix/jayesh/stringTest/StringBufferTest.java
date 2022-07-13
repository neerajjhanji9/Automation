package com.matrix.jayesh.stringTest;

public class StringBufferTest {
    /**
     * mutable means modifiable of string/liable to change.
     * initial capacity of 16 char.(default is 16 char)
     *
     * Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
     * So it is safe and will result in an order.
     * ie synchronized == means two threads can't call the methods of StringBuffer simultaneously.
     *
     * **/
    public static void main(String[] args) {
        StringBuffer obj1 =new StringBuffer("Jayesh");
        System.out.println("**************************************************");
        System.out.println(obj1.capacity()); // (16+6) = 22

        obj1.append("Pansare"); // change orginal string
        System.out.println(obj1); // result is  = JayeshPansare

        System.out.println("*************************************************");
        obj1.insert(2, "Added"); // insert data after index 2
        System.out.println(obj1); // JaAddedyeshPansare

        System.out.println("*************************************************");
        obj1.reverse();
        System.out.println(obj1); // erasnaPhseydeddAaJ


        // obj1.charAt();

    }
}
