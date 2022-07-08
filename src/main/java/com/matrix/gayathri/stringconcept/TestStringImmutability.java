package com.matrix.gayathri.stringconcept;

public class TestStringImmutability {

    public static void main(String[] args) {
        // concat() method
        String st = "Gayathri";
        st= st.concat(" Arangi");  // String Immutable = need to give reference explicitly
        System.out.println(st);

        //StringBuffer() method
        StringBuffer s = new StringBuffer("Gayathri");
        s.append(" Anil");               // String mutable
        System.out.println(s);
    }
}
