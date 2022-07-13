package com.matrix.vipin.String;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class TeatStringMethods {

    public static void main(String[] args) {
        String str1 = "James ";
        System.out.println("length() :" +str1.length());

        char [] ch = {'s','v','n'};
        String [] star2 = {"vipin1" , "vipin2"};
        System.out.println(ch.length);
        System.out.println(star2.length);

        String str3 = "VIPIN";
        System.out.println(str3.toLowerCase());

        String str4 = "vipin";
        System.out.println(str4.toUpperCase());

        String str5 = "     vipin    Yadav    ";
        System.out.println(str5.trim());

        String str6 = "vipin";
        String str7 = "vipin";
        System.out.println(str6.equals(str7));
        String str8 = "VIPIN";
        System.out.println(str8.startsWith("IP"));
        System.out.println(str8.endsWith("pin"));
        System.out.println(str8.contains("VIP"));
        System.out.println(str8.replace('V','S'));
        System.out.println(str8.replace("VIPIN","ARNAB"));
        System.out.println(str8.indexOf('P'));
        System.out.println(str8.indexOf("VIP"));
        System.out.println(str8.lastIndexOf('I'));
        System.out.println(str8.isEmpty());
        System.out.println(str8.substring(0,4));






    }
}
