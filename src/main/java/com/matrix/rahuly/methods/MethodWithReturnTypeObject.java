package com.matrix.rahuly.methods;

public class MethodWithReturnTypeObject {

    public Student getStudentDetails() {
        Student st = new Student();
        return st;
    }

    public static void main(String[] args) {
        MethodWithReturnTypeObject obj = new MethodWithReturnTypeObject();
        Student st = obj.getStudentDetails();

    }
}
