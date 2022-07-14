package com.matrix.amitb.corejava.stringconcepts.testingstring1;

public class IdentityHashCode {

    public static void main(String[]args){


        // 1.By using object way
        String str1 = new String("Amit");
        String str2 = new String("Ami");
        String str5 = new String("Amit");

        System.out.println("Memory Address of str1" +System.identityHashCode(str1)); //245257410
        System.out.println("Memory Address of str2" +System.identityHashCode(str2)); //1705736037
        System.out.println("Memory Address of str5" +System.identityHashCode(str5)); //455659002

        // 2.By using String literal way
        String str3 = "Am";
        String str4 = "Ams";
        String str6 = "Am";


        System.out.println("Memory Address of str3" +System.identityHashCode(str3)); //250421012
        System.out.println("Memory Address of str4" +System.identityHashCode(str4)); //1915318863
        System.out.println("Memory Address of str6" +System.identityHashCode(str6)); //250421012

    }
}
