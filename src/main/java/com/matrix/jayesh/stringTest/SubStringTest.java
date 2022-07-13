package com.matrix.jayesh.stringTest;

public class SubStringTest {
    static String str = "jayesh";

    static String str1 = "jayesh pansare";

    public static void main(String[] args) {
        System.out.println(str.substring(2)); //yesh

        System.out.println(str.substring(2,5)); //yes

        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 80
        //System.out.println(str.substring(2,80));

        String [] result = str1.split("\\ ");
        if (result!=null) {
            for (String res : result) {
                System.out.println(res.substring(2));
            }
        }
    }
}
