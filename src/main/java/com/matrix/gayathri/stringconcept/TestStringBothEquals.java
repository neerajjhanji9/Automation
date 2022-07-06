package com.matrix.gayathri.stringconcept;

public class TestStringBothEquals {

    public static void main(String[] args) {
        //1. By using Object way
        String st1 = new String("Gayathri");
        String st2 = new String( "Ayaansh");
        String st3 = new String("Gayathri");

        System.out.println("Memory Address of  st1 : " + System.identityHashCode(st1)); //460141958
        System.out.println("Memory Address of  st2 : " + System.identityHashCode(st2)); //1163157884
        System.out.println("Memory Address of  st3 : " + System.identityHashCode(st3)); //1956725890

        //2. By Using String Literal way
        String st4 = "Anil";
        String st5 = "Ayaansh";
        String st6 = "Anil";

        System.out.println("Memory Address of  st4 : " + System.identityHashCode(st4)); //356573597
        System.out.println("Memory Address of  st5 : " + System.identityHashCode(st5)); //1735600054
        System.out.println("Memory Address of  st6 : " + System.identityHashCode(st6)); //356573597

        // == does reference comparison
        System.out.println(st1 == st3); // False
        System.out.println(st4 == st6); // True
        System.out.println(st2 == st5); // False

        //equals() method does content comparison
        System.out.println(st1.equals(st3)); // True
        System.out.println(st2.equals(st5)); // True
        System.out.println(st4.equals(st6)); // True


    }
}
