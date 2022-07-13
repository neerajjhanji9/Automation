package com.matrix.akhilesh.programs;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Akhilesh";

        int i = str.length() - 1;

        for(i = i; i>=0; i--){
            System.out.print(str.charAt(i) +"");
        }
    }
}
