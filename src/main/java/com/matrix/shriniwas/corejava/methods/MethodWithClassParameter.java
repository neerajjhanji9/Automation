package com.matrix.shriniwas.corejava.methods;

public class MethodWithClassParameter {

    public void getData(Employee o) {
        System.out.println(o.name); // 1b28cdfa
        System.out.println(o.empId);
        System.out.println(o.company);
    }

    public void getInfo(Student s) {
        System.out.println(s.name); // eed1f14
        System.out.println(s.rollNo);
    }

    public void display(Employee e, Student s) {
        System.out.println(e); // 1b28cdfa
        System.out.println(s); // eed1f14
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Student st1 = new Student();

        MethodWithClassParameter o = new MethodWithClassParameter();
        o.getData(obj1); // 10, "Shri", obj1 is of type Employee
        o.getInfo(st1); // st1 is of type Student
        o.display(obj1, st1);
    }
}
