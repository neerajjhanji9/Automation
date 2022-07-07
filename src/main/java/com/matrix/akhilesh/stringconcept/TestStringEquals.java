package com.matrix.akhilesh.stringconcept;

public class TestStringEquals {

    public static void main(String[] args) {
        String str1 = new String("Akhilesh");
        String str2 = new String("Akhil");
        String str3 = new String("Akhilesh");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));

        String str4 = "Akhilesh";
        String str5 = "Akhil";
        String str6 = "Akhilesh";

        System.out.println(str4.equals(str5));
        System.out.println(str5.equals(str6));
        System.out.println(str4.equals(str6));
    }
}
