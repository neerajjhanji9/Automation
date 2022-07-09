package com.matrix.dhanshri.corejava.stringconcept;

public class TestStringEquals {

    public static void main(String[] args) {

        String str1 = new String("Dhanu2");
        String str2 = new String("Dhanu2");
        String str3 = new String("Dhanashree");

        System.out.println(str1.equals(str2));//true : .equals() method compares content of string
        System.out.println(str2.equals(str3));//false
        System.out.println(str3.equals(str1));//false

        String str4= "Dhanu2";
        String str5= "Dhanu3";
        String str6= "Dhanu2";

        System.out.println(str4.equals(str5));//false
        System.out.println(str4.equals(str6));//true
    }
}
