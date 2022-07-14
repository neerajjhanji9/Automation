package com.matrix.akhilesh.methods;

public class MethodWithClassParameter {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Student st = new Student();

        MethodWithClassParameter obj = new MethodWithClassParameter();
        obj.getEmp(emp);
        obj.getStudent(st);
        obj.getDetails(emp, st);
    }

    public void getEmp(Employee o){
        System.out.println(o.empId);
        System.out.println(o.str);
        System.out.println("----------------------------");
    }

    public void getStudent(Student s){
        System.out.println(s.rollNo);
        System.out.println(s.str);
        System.out.println(s.com);
        System.out.println("----------------------------");
    }

    public void getDetails(Employee et, Student st){
        System.out.println(et.str);
        System.out.println(et.empId);
        System.out.println(st.rollNo);
        System.out.println(st.str);
        System.out.println(st.com);
        System.out.println("---------------------------");
    }
}
