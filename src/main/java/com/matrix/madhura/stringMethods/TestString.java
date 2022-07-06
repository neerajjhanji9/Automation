package com.matrix.madhura.stringMethods;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TestString {
    public static void main(String[] args) {
        String str1 = new String("madhura");
        String  str2 = new String("madhu");
        String str3 = new String("madhura");

        System.out.println("Memory address of str1 : " +System.identityHashCode(str1));
        System.out.println("Memory address of str2 : " +System.identityHashCode(str2));
        System.out.println("Memory address of str3 : " +System.identityHashCode(str3));

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

        String str4 ="narendra";
        String  str5 ="naren";
        String str6 = "narendra";

        System.out.println("Memory address of str4 : " +System.identityHashCode(str4));
        System.out.println("Memoery address of str5 : "+System.identityHashCode(str5));
        System.out.println("Memory address of str5 : "+System.identityHashCode(str6));

        System.out.println(str4 == str5);
        System.out.println(str5 == str6);
        System.out.println(str4 == str6);


    }

}
