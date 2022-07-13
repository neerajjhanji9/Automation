package com.matrix.jayesh.blocksTest;

public class BlockTest {

    {
        System.out.println("block section");
    }
    BlockTest(){
        System.out.println("first section");
    }

    BlockTest(int b){
        System.out.println("second section");
    }
    public static void main(String[] args) {
        new BlockTest();
        System.out.println("-------------------------------");
        new BlockTest(20);
    }
}
