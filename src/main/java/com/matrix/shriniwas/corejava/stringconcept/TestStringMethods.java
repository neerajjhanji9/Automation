package com.matrix.shriniwas.corejava.stringconcept;

public class TestStringMethods {

    public static void main(String[] args) {
       String str1 = "Shriniwas";
       System.out.println("Length() : " +str1.length());

       char [] ch = {'s', 'h', 'r', 'i'};
       String [] strArr = {"Shri1", "Shri2"};

       System.out.println(ch.length);
       System.out.println(strArr.length);

       String str2 = "SHRINIWAS";
       System.out.println("toLowerCase(): " +str2.toLowerCase());

       System.out.println("toUpperCase(): " +str1.toUpperCase());

       String str3 = "       Shriniwas      Alle       ";
       System.out.println("trim():" +str3.trim());

       String str4 = "Shri";
       String str5 = "shri";
       System.out.println("equals() : " +str4.equals(str5));

    }
}
