package com.matrix.rahuly.methods;

public class MethodWithClassParameters {

    public void getData() {
        Employee em = new Employee();
        System.out.println(em.name);
        System.out.println(em.company);
        System.out.println(em.empId);
    }

    public void getData1() {
        Student st = new Student();
        System.out.println(st.S);
        System.out.println(st.roll);
    }

    public static void main(String[] args) {
        MethodWithClassParameters obj = new MethodWithClassParameters();
        obj.getData();
        obj.getData1();


    }

}

