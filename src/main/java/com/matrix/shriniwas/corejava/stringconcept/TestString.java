package com.matrix.shriniwas.corejava.stringconcept;

public class TestString {

    public static void main(String[] args) {

        // 1. By using object way
        String str1 = new String("Shriniwas"); // 245257410
        String str2 = new String("Nikhilesh"); // 1705736037
        String str5 = new String("Shriniwas"); // 455659002
        System.out.println("Memory Address of str1: " +System.identityHashCode(str1)); // This is will print the memory location of str1
        System.out.println("Memory Address of str2: " +System.identityHashCode(str2)); // This is will print the memory location of str2
        System.out.println("Memory Address of str3: " +System.identityHashCode(str5)); // This is will print the memory location of str3

        System.out.println(str1 == str5); // false : == does Reference(memory address) comparison

        // 2. By using String literal
        String str3 = "Shri";   // 250421012
        String str4 = "Shrini"; // 1915318863
        String str6 = "Shri";   // 250421012

        System.out.println("Memory Address of str3: " +System.identityHashCode(str3)); // This is will print the memory location of str3
        System.out.println("Memory Address of str4: " +System.identityHashCode(str4)); // This is will print the memory location of str4
        System.out.println("Memory Address of str6: " +System.identityHashCode(str6)); // This is will print the memory location of str6

        System.out.println(str3 == str6); // true : == does Reference(memory address) comparison
    }
}
