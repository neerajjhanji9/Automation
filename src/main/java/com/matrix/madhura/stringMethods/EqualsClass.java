package com.matrix.madhura.stringMethods;

import javax.sound.midi.Soundbank;

public class EqualsClass {
    public static void main(String[] args) {
        String str1 = new String("madhura");
        String str2 = new String("madhura");
        String str3 = new String("madhu");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));

        String str4 = "komal";
        String str5 = "sony";
        String str6 = "sony";

        System.out.println(str4.equals(str5));
        System.out.println(str5.equals(str6));
        System.out.println(str4.equals(str6));

    }
}
