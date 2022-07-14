package com.matrix.amitb.corejava.stringconcepts.testingstring1;

public class TestStringDotEquals {

    // Content Comparision


    public static void main(String[]args){

        String str1 = new String("Amit"); //true
        String str2 = new String("Amit"); //false
        String str3 = new String("Ami"); //false

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));


        String str4 = "Am";
        String str5 = "Ams";
        String str6 = "Am";

        System.out.println(str4.equals(str6)); //true
        System.out.println(str4.equals(str5)); //false
        System.out.println(str5.equals(str6)); //false
    }
}
