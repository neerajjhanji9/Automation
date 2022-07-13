package com.matrix.dhanshri.corejava.simpleprograms;

public class Palindrome {
    public static void main(String[] args) {

        String str = "Dhan";
        String reverse = " "; // Objects of String class
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not palindrome");
    }
}
