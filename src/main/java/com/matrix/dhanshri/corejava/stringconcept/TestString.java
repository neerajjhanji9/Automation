package com.matrix.dhanshri.corejava.stringconcept;

public class TestString {

    public static void main(String[] args) {

        //by using object way
        String str1= new String("Dhanashri");
        String str2= new String("Renuka");
        String str5= new String("Dhanashri");

        System.out.println(str1==str5);//false : Reference comparison

        // by using string literal way
        String str3 = "Dhanashri";
        String str4= "Dhanu";
        String str6="Dhanu";

        System.out.println(str4==str6);//true

    }
}
