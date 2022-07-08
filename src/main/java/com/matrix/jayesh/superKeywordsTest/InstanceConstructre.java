package com.matrix.jayesh.superKeywordsTest;

public class InstanceConstructre {

    public static void main(String[] args) {
        ClassConA obj = new ClassConA(10, "jayesh", 15000);
        obj.display();
    }

    /**
     * Result -
     * class constructor B
     * class constructor A
     * **/

    /**
     *  first call super class
     *  then static method
     *  then {}
     *  then constructor
     *  then main method
     *  then method
     * **/
}
