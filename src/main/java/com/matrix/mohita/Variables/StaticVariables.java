package com.matrix.mohita.Variables;

public class StaticVariables {

    // Static Variables declared at class level
    static int number = 8;
    static char ch = 'M';

    // Static Method

    public static void getData() {
        System.out.println(ch);      // Static Area : Direct access

    }
    // Instance Method

    public void getData1(){
        System.out.println(ch);           // Instance Area : Direct access
    }

    public static void main(String[] args) {
        StaticVariables obj = new StaticVariables();     // obj creation
        // 1. Direct Access
        System.out.println(number);

        // 2. By using Object Reference
        System.out.println(obj.number);

        // 3. By Using Class name
        System.out.println(StaticVariables.number);
    }

}
