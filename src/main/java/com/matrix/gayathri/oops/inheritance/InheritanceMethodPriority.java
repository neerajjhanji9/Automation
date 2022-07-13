package com.matrix.gayathri.oops.inheritance;
/** If Parent and child class have same method names, the latter will be given priority
 * To differentiate we can use "this.method()" for current method(child class),
 * and "super.method()" to access Parent class methods.
 */
class Parent1{
    int x = 50; int y = 100;
    void m1(){
        System.out.println("m1 Parent1 method");
    }
    void m2(int a, int b){
        System.out.println("Addition : "+ (a + b));
    }
    void m3(){
        System.out.println("m3 Parent method");
    }
}
 class Child1 extends Parent1{
    void m1(){
        this.m2();
        System.out.println("m1 Child method");
    }
    void m2(){
        super.m1();
        System.out.println("Multiplication c: "+ (super.x*super.y));
    }
    void m3(String name){
        super.m2(10,20);
        System.out.println("Name :"+ name);
    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.m1();                              // Child method
        c1.m3("Child m3 method");
        c1.m3();                              // Parent method

    }
}
public class InheritanceMethodPriority {
}
