package com.matrix.amitb.corejava.stringconcepts.testingstring1;

public class StringTestingExactlyEquals {

    public static void main(String[]args){

        // 1.By using object way
        String str1 = new String("Amit");
        String str2 = new String("Ami");
        String str5 = new String("Amit");

        System.out.println(str1 ==str5); //false : == does reference comparision

        // 2.By using String literal way
        String str3 = "Am";
        String str4 = "Ams";
        String str6 = "Am";

        System.out.println(str3 ==str6);  //true : == does reference comparision
    }
}
