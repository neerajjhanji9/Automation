package com.matrix.akhilesh.stringconcept;

public class TestStringMethods {

    public static void main(String[] args) {
        String str1 = new String("Akhilesh");
        System.out.println(str1.length());

        String str2 = new String("akhilesh");
        System.out.println(str2.toUpperCase());

        String str3 = new String("Akhilesh");
        System.out.println(str3.toLowerCase());

        String str4 = "             Hello Moto        ";
        System.out.println(str4.trim());

        System.out.println(str2.equals(str3));
    }
}
