package com.matrix.mohita.methods;

import javax.sound.midi.Soundbank;

public class MethodWithClassParameters {
    public void getData(Employee e){
        System.out.println(e.name);
        System.out.println(e.ofc);
        System.out.println(e.empId);
    }
    public void getInfo(Student s){
        System.out.println(s. name);
        System.out.println(s. school);
        System.out.println(s. rollNo);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Student stu = new Student();
        MethodWithClassParameters obj = new MethodWithClassParameters();
        obj. getData(emp);
        System.out.println("-*_*_*_*_*_*_*_*");
        obj.getInfo(stu);
    }
}
