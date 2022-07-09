package com.matrix.dhanshri.corejava.stringconcept;

public class TestStringMethods {
    public static void main(String[] args) {
        String str1 = "Dhanashree";
        System.out.println(str1.length());//10

        char[] ch= { 'd', 'a', 's', 'n' };
        String [] strArr= {"Dhan", "Dhanu1", "Dhanu2"};

        System.out.println(ch.length); // 4
        System.out.println(strArr.length);//3
        System.out.println(str1.toLowerCase());// dhanashree
        System.out.println(str1.toUpperCase());// DHANASHREE
        String str2= "             Dhanshree   Bhosale             ";
        System.out.println(str2.trim()); //it is used for spaces between characters
        System.out.println(str1.equals(str2)); //false : it compares content matching or not
    }
}

