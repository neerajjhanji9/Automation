package com.matrix.rahuly.inheritance;

public class Animals {

    public void eat() {
        System.out.println("Eating");
    }
}

   class Dog extends Animals {
       public void bark() {
           System.out.println("Braking");
       }
   }

    class BabyDog extends Dog {
        public void weep() {
            System.out.println("Weeping");
        }


    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }


}
