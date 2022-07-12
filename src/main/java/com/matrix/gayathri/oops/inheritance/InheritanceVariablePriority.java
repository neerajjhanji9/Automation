package com.matrix.gayathri.oops.inheritance;

/** If Parent and child class have same variables, the latter will be given priority
 * To differentiate we can use "this." for current variables(child class),
 * and "super." for Parent class variables.
 *
 */
class Parent{
    int a = 10;
    int b = 20;
    int c = 30;
}
class Child extends Parent{
    int a = 1000;
    int b = 2000;
    int x = 500;
    void add() {
        System.out.println("Child variables addition : " + (a + b));
        System.out.println("Parent variables addition : " + (super.a + super.b));
        System.out.println("Parent and child different variables addition : " + (x + c));
        System.out.println("Parent and child same variables addition : " + (this.a + super.a + this.b + super.b));
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.add();
    }
}
public class InheritanceVariablePriority {

}
