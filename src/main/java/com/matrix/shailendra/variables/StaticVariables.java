package com.matrix.shailendra.variables;

public class StaticVariables {
    // static variables
    static int count = 65;

    // Instance method
    public void grtData(){
       // Instance area - Direct access
        System.out.println(count);
    }

    // static method
    public static void getData2() {
        //static area
        System.out.println(count);
    }
        public static void main(String[] args) {
            StaticVariables st = new StaticVariables();
            // 1. Direct Access
            System.out.println(count);

            // 2. By using object reference
            System.out.println(st.count);

            // 3. By using class name
            System.out.println(StaticVariables.count);

        }
}
