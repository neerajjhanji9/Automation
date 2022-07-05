package com.matrix.shriniwas.corejava.stringconcept;

public class TestString {

    public static void main(String[] args) {

        // 1. By using object way
        String str1 = new String("Shriniwas");
        String str2 = new String("Nikhilesh");
        String str5 = new String("Shriniwas");
        System.out.println(str1 == str5); // false : == does Reference comparison

        // 2. By using String literal
        String str3 = "Shri";
        String str4 = "Shrini";
        String str6 = "Shri";

        System.out.println(str3 == str6); // true : == does Reference comparison
    }
}
