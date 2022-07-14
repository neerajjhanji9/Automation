package com.matrix.amita.corejava.constructor;

public class Student5 {

    int RollNo;
    String Name;
    public Student5(int RollNo, String Name){
        this.RollNo=RollNo;
        this.Name=Name;
        System.out.println(this.RollNo);
        System.out.println(this.Name);
    }

    public static void main(String[] args) {
        Student5 st=new Student5(11, "Amita1");
        Student5 st1=new Student5(12, "Amita2");
    }
}
