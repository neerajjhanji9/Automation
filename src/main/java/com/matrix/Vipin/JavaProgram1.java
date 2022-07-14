package com.matrix.Vipin;

public class JavaProgram1 {
    public static void main(String[] args) {
        // write your program
        System.out.print("My program");
        // Variable
        String name = "Vipin";
        int age =30;
        String neighbour ="Yadav";
        String friend ="neighbour";
        /*byte -1 [ -128 to 127]
        short - 2 byte
        int -4 byte  1,2,3
        long -8 byte
        float -4 byte 3.1,3.5
        double -8 byte
        char-2 a,b,c
        boolean-1 true/false


        */
        byte marks =30;
        int phone = 1234567890;
        long phone2  = 12345678900L;
        float pi =3.14F;
        char latter = '@';
        boolean isAdult = false;
        // non-Primitive type

        String caste = "rajput";
        System.out.println(caste.length());
        //concatenate
        String name1 = "vipin";
        String name2 = "Akash";
        String name3 = name1 + " and "+ name2;
        System.out.println(name3);
        //charAt
        String name5 = "Radha";
        System.out.println(name5.charAt(0));
        System.out.println(name5.length());
        //replace
        String name10= "krishna";
       String name11 = name.replace('a' ,'m');
        System.out.println(name11);
        //substring
        String name34= "pyush and krish";

        System.out.println(name34.substring(6,9));
        //Arrays
        int physics =30;
        int chem =301;
        int math =300;
        int [] marks3 = new int[3];
        marks3[0]= 30;
        marks3[1]= 30;
        marks3[2]= 30;
        System.out.println(marks3[0]);
        //length
        int physicss =30;
        int chems =301;
        int maths =300;
        int [] marks4 = new int[3];
        marks4[0]= 30;
        marks4[1]= 30;
        marks4[2]= 30;
        System.out.println(marks4.length);

















    }
}
