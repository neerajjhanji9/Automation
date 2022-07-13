package com.matrix.gayathri.methods.classparameters;

public class Class7 {

    public void marks(String s,char c,int r, int i, int in){
        System.out.println(s + " from Section " + c +" with Roll no: " + r + " Marks are: "+ i + ',' + in);
    }

    public static void main(String[] args) {
        Student1 obj1= new Student1();
        Student2 obj2 = new Student2();
        Student3 obj3 =new Student3();
        Class7 ob = new Class7();
        ob.marks(obj1.name, obj1.section, obj1.roll_no, obj1.maths, obj1.science);
        ob.marks(obj2.name, obj2.section, obj2.roll_no, obj2.maths, obj2.science);
        ob.marks(obj3.name, obj3.section, obj3.roll_no, obj3.maths, obj3.science);
    }
}
