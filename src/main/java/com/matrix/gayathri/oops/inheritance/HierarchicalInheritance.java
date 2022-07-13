package com.matrix.gayathri.oops.inheritance;

/** HierarchicalInheritance : One Super class and many sub classes
 *               WildAnimals
 *               /    |     \
 *          Elephant Lion Cheetah
 */
class WildAnimals{
    void types(){
        System.out.println("Hello Elephant, Cheetah and Lion");
    }
    WildAnimals(){
        System.out.println("Wild Animals live in Jungle");
    }
}
class Lion extends WildAnimals{
    void Features(){
        System.out.println("Lion : Im fierce and I roar");
    }
}
class Cheetah extends WildAnimals{
    void Features(){
        System.out.println("Cheetah : Im a large Cat and I run fast");
    }
}
class Elephant extends WildAnimals{
    void Features(){
        System.out.println("Elephant : Im very big,intelligent and I have trunk");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.types();
        e.Features();
        Cheetah ch = new Cheetah();
        ch.types();
        ch.Features();
        Lion l= new Lion();
        l.types();
        l.Features();


    }


}
