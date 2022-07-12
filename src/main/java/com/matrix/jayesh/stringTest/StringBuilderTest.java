package com.matrix.jayesh.stringTest;

public class StringBuilderTest {
    /**
     * Same as StringBuffer
     * diff is it is non- synchronized = means two threads can call the methods of StringBuilder simultaneously.
     *
     * **/
    public static void main(String[] args) {
        StringBuilder obj1 =new StringBuilder("Jayesh");
        obj1.append(" pansare");
        System.out.println(obj1); // Jayesh pansare
        System.out.println(obj1.capacity()); //22
    }
}
