package com.matrix.nikhil.newJava;

   class Vehicle {
        Vehicle() {
            System.out.println("I am In Vehicle Class");
        }
    }
    class FourWheeler extends Vehicle{
        FourWheeler(){
            System.out.println("I am In Four-Wheeler Class");
        }
    }
    class TwoWheeler extends FourWheeler{
        TwoWheeler(){
            System.out.println("I am In Two-rWheeler Class");
        }
        public class MultiLevel{} // Main Class open & Closed means it was not used

    public static void main(String[] args) {

        TwoWheeler obj1 = new TwoWheeler();


    }
}
