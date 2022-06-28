package com.matrix.dhanashri.corejava;

public class MethodWithClassParameter {
    public void getData(Employee o){
        System.out.println(o.name);
        System.out.println(o.Company);
        System.out.println(o.EmpId);
    }

    public void getInfo(Student s){
        System.out.println(s.name);
    }

    public void display(Employee e, Student s){
        System.out.println(e);
        System.out.println(s);

    }
    public static void main(String[] args) {
        Employee obj1= new Employee();
        Student st1= new Student();

        MethodWithClassParameter o= new MethodWithClassParameter();
        o.getData(obj1);
        o.getInfo(st1);
        o.display(obj1,st1);

    }
}

