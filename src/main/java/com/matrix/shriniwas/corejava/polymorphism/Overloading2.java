package com.matrix.shriniwas.corejava.polymorphism;

public class Overloading2 {

    public void getDetails(int empId, String empName, String companyName) {
        System.out.println("EmpId is: " + empId +"Name is: "+empName +" Company Name is: "+companyName);
    }

    public void getDetails(String name, int age) {
        System.out.println("Name is: " + name +" Age is: "+age);
    }

    public static void main(String[] args) {
        Overloading2 obj = new Overloading2();
        obj.getDetails("Shriniwas", 10);
        obj.getDetails(100, "Shriniwas", "Microsoft");
    }

}
