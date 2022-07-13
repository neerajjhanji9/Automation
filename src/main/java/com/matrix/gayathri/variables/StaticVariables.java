package com.matrix.gayathri.variables;

public class StaticVariables {

    // Static Variables declared at class level
    static int number = 8;
    static char ch = 'G';

    // Static Method

    public static void getData() {
        System.out.println(ch);            //Static Area : Direct access

    }
    // Instance Method

    public void getData1() {
        System.out.println(ch);         // Instance Area :Direct access
    }

    public static void main(String[] args) {
        StaticVariables obj =new StaticVariables();  //obj creation
        // 1. Direct Access
        System.out.println(number);

        // 2. By Using Object Reference
        System.out.println(obj.number);

        // 3. By Using Class name
        System.out.println(StaticVariables.number);
    }

}
