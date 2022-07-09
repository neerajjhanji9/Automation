package com.matrix.shriniwas.corejava.interitance;

public class TestChild extends TestParent {

    int a = 10;
    int b = 20;

    public void getData() {
        System.out.println(a+b); // 30
        System.out.println(x+y); // 300
    }

    public void getDetails() {
        System.out.println(this.a + this.b); // 30
        System.out.println(x+y); // 300
        System.out.println(super.a + super.b); // 30
    }

    public void m1() {
        System.out.println("I am in Child:: m1 method");
    }

    public void m2() {
        this.m1();
        super.m1();
        m3();
        super.m4(25,25);
        System.out.println("I am in Child:: m2 method");
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();
        obj.getData();
        obj.getDetails();
        System.out.println("---------------------");
        obj.m2();
        System.out.println("---------------------");
        obj.m3();
        obj.m4(50,50);
    }
}
