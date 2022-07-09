package com.matrix.jayesh.overloading;
/**
 * Adv -
 * Method overloading increases the readability of the program.
 *
 * Note - Not possible on changing or multiple inheritance.
 *
 * Two ways
 * - By changing number of arguments
 * - By changing the data type
 * **/
public class ChildTest {
    public static void main(String[] args) {
        ParentTest obj = new ParentTest(); // Static Binding (also known as Early Binding).

        obj.subStract(); // By changing number of arguments
        obj.subStract(10,20); // By changing number of arguments
        obj.subStract(10,20,30); // By changing number of arguments


        double testNo = obj.subStract(10.5, 20.5, 30.5); // By changing the data type

        System.out.println(testNo); // call return type
        System.out.println(obj.subStract(10.5, 20.5, 30.5)); // another way to call


    }
}
