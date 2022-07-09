package com.matrix.dhanshri.corejava.simpleprograms;

public class TestPractice1 {
    void TestPractice1(){
        System.out.println("Amsterdam");
    }

    TestPractice1(){
        System.out.println("Antartica");
    }

    public static void main(String[] args) {
       TestPractice1 tc= new TestPractice1();///only constructor can run: Antartica is o/p
         TestPractice1 tc1= new TestPractice1();

    }
}
