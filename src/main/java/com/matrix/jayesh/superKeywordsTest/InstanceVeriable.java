package com.matrix.jayesh.superKeywordsTest;

public class InstanceVeriable {
    // super keyword used to ref immediate parent class object.
    // Uses of java super keywords
    // - used to refer immediate parent class instance variable.=> call veriable
    // - used to invoke immediate parent class method. => call method
    // - used to invoke immediate parent class constructor.
    public static void main(String[] args) {
        ClassVerA obj = new ClassVerA();
        obj.display();

        // call by string.
        String testString = obj.testString;
        System.out.println(testString);

        // call by method
        obj.testDisplay();
    }
}
