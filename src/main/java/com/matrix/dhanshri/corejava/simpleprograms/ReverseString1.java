package com.matrix.dhanshri.corejava.simpleprograms;


public class ReverseString1 {

    public static void main(String[] args) {

        String str = new String("My name is Dhanashri Bhosale");
        System.out.println(str.length());
        String[] st = str.split(" ");
        System.out.println(st.length);

        for (int j = st.length- 1; j >= 0; j--)
        {

            System.out.println(st[j]);
        }
    }
}

