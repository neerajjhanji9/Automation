package com.matrix.mohita.stringconcept;

public class TestStringImmutability {
    public static void main(String[] args) {
        // concat() method
        String st = "Monika";
        st = st.concat("Gupta");   // String Immutable = need to give reference explicitly
        System.out.println(st);

        //StringBuffer () Method
        System.out.println("Ashi" + "Mahi" // String mutable
        );
         }
}
