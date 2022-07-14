package com.matrix.kishor.corejava.stringconcept;

public class TestStringEquals {

    public static void main(String[] args) {
        String str1 = new String ("Kishor");
        String str2 = new String ("Kishor");
        String str3 = new String ("KTM");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
