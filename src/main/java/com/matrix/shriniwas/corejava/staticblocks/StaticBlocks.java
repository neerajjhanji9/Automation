package com.matrix.shriniwas.corejava.staticblocks;

public class StaticBlocks {

    static {
        // Database connectivity
        // Load Excel Files, Text File, Json File, Configuration Files, XML Files
        System.out.println("I am in static block");
    }

    StaticBlocks() {
        System.out.println("0-args Constructor..");
    }

    StaticBlocks(int age) {
        System.out.println("1-args Constructor..");
    }

    StaticBlocks(int age, String name) {
        System.out.println("2-args Constructor..");
    }

    public static void main(String[] args) {
        new StaticBlocks();
        new StaticBlocks(10);
        new StaticBlocks(10, "Shriniwas");
    }
}
