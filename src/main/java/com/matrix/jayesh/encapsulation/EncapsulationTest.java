package com.matrix.jayesh.encapsulation;

public class EncapsulationTest {
    //encapsulation in Java is a process of wrapping code and data together into a single unit,

    public static void main(String[] args) {
        TestAClass obj = new TestAClass();
        obj.setData("Jayesh"); // set data

        String userNameResult =  obj.getData(); // get data
        System.out.println(userNameResult);

    }
}
