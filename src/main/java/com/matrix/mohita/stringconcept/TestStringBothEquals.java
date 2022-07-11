package com.matrix.mohita.stringconcept;

public class TestStringBothEquals {

    public static void main(String[] args) {
        // 1. By using Object way
        String st1 = "Monika";
        String st2 = "Ashish";
        String st3 = "Monika";

        System.out.println("Memory Address of st1 : " + System.identityHashCode(st1));  //460141958
        System.out.println("Memory Address of st2 : " + System.identityHashCode(st2));  //1163157884
        System.out.println("Memory Address of st3 : " + System.identityHashCode(st3));  //1956725890

        //2. By Using String Literal way
        String st4 = "Anita";
        String st5 = "Mohan";
        String st6 = "Anita";

        System.out.println("Memory Address of st4 : " + System.identityHashCode(st4));  //356573597
        System.out.println("Memory Address of st5 : " + System.identityHashCode(st5));  //1735600054
        System.out.println("Memory Address of st6 : " + System.identityHashCode(st6));  //356573597

        // == Does reference comparison
        System.out.println(true);  // true
        System.out.println(true);  // True
        System.out.println(false);  // False

        // equals() method does content comparison
        System.out.println(true); //True
        System.out.println(false); //False
        System.out.println(true); //True
    }
}
