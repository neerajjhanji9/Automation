package com.matrix.akhilesh.stringconcept;

public class TestString {

    public static void main(String[] args) {
        String str1 = new String("Akhilesh");
        String str2 = new String("Kamlesh");
        String str5 = new String("Akhilesh");

        System.out.println(System.identityHashCode(str1)); //Memory Allocation
        System.out.println(System.identityHashCode(str2)); //Memory Allocation
        System.out.println(System.identityHashCode(str5)); //Memory Allocation
        System.out.println("-------------------");
        System.out.println(str1 == str5);
        System.out.println("-------------------");

        String str3 = "Akhil";
        String str4 = "Akhilesh";
        String str6 = "Akhil";

        System.out.println(System.identityHashCode(str3)); //Memory Allocation
        System.out.println(System.identityHashCode(str4)); //Memory Allocation
        System.out.println(System.identityHashCode(str6)); //Memory Allocation
        System.out.println("------------------");
        System.out.println(str3 == str6);
    }
}
