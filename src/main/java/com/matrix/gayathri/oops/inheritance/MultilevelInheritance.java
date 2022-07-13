package com.matrix.gayathri.oops.inheritance;

/** MultilevelInheritance : Chain of Inheritance
 *  Animal
 *     |
 *    Dog
 *     |
 *   PetDog
 *     |
 *    Pug
 */
class PetDog extends Dog{
    void breed(){
        System.out.println("Im a Pug");
    }
}
class Pug extends PetDog{
    void origin(){
        System.out.println("Im originally from China");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Pug p = new Pug();
        p.eat();
        p.bark();
        p.breed();
        p.origin();

    }
}
