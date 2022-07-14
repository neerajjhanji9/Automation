package com.matrix.dhanshri.corejava.methodsconcept;

public class StudentClass {

    int rollNo;
    String name;

    public StudentClass(int roll, String nm){
        rollNo=roll;
        name=nm;
        System.out.println(rollNo);
        System.out.println(name);
    }
    public StudentClass(){
        System.out.println("This is a default Constructor");
    }

    public void getDetails() {
        System.out.println(rollNo);
        System.out.println(name);
    }

    public static void main(String[] args){
            StudentClass s1 = new StudentClass(10, "Dhanu1");
            s1.getDetails();
            StudentClass s2 = new StudentClass(20, "Dhanu2");
            s2.getDetails();
            StudentClass s3 = new StudentClass(30, "Dhanu3");
            s3.getDetails();


    }
}
