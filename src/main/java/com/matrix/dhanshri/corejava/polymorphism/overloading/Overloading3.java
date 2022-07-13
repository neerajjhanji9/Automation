package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class Overloading3 {

    public void m1(int age, String name){
        System.out.println(age+  "----"   +name);
    }

    public void m2(String name, int age){
        System.out.println(name+  "----"  +age);
    }

    public void m3(String[] strArr, int[] Arr){
        for(String s: strArr){                     //for each loop
            System.out.println(s);
        }
        for(int i: Arr){
            System.out.println(i);
        }
    }
    public void m1(Student st){
        System.out.println(st.studentname);
        System.out.println(st.rollno);
    }

    public int m1(){
        return 10;
    }

    public static void main(String[] args) {
        Overloading3 o= new Overloading3();
        o.m1(10, "Shravani");
        o.m2("Rajshri", 5);

        String [] star={ "Dhan1", "Dhan2", "Dhan3"};
        int [] in= {10, 100, 1000};

        o.m3(star, in);

        Student st= new Student();
        o.m1(st);

        System.out.println("return value is  :"  +o.m1());

    }
}
