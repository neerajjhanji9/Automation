package com.matrix.dhanshri.corejava.simpleprograms;

public class ReverseString {
    public static void main(String[] args) {
        String str="Dhanashri";
        String rvs=" ";
        char ch;

        System.out.println(str);
        System.out.println(str.length());

        for(int i=0; i<str.length(); i++) {

            ch = str.charAt(i);
            rvs = ch + rvs;

        }
        System.out.println("The reverse string is:"   +rvs);


        }
    }

