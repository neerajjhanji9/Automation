package com.matrix.gayathri.oops.inheritance;
 /**Single Inheritance : one to one mapping
 *        Animal
 *           |
 *         Dog
 */

class Animal {
    void eat(){
        System.out.println("I am an animal and I eat meat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog: barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d  = new Dog();
        d.eat();
        d.bark();

    }
}
