package com.matrix.rahuly.methods;

public class MethodWithClassParameter1 {

    public void getDisplay(Employee e) {
        System.out.println(e.name);
        System.out.println(e.company);
        System.out.println(e.empId);
    }

    public void getData(Student s) {
        System.out.println(s.S);
        System.out.println(s.roll);
    }

    public void display(Employee e, Student s) {
        System.out.println(e);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Student st1 = new Student();

        MethodWithClassParameter1 m2 = new MethodWithClassParameter1();
        m2.getDisplay(emp);
        m2.getData(st1);
        m2.display(emp, st1);
    }

}
