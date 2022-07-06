package com.matrix.shriniwas.corejava.stringconcept;

public class TestStringEquals {

    public static void main(String[] args) {
        String str1 = new String("Shriniwas");
        String str2 = new String("Shriniwas");
        String str3 = new String("Shrini");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str2.equals(str3)); // false

        String str4 = "Nikhilesh";
        String str5 = "Nikhil";
        String str6 = "Nikhilesh";
        System.out.println(str4.equals(str6)); // true
        System.out.println(str4.equals(str5)); // false
        System.out.println(str5.equals(str6)); // false
    }
}
