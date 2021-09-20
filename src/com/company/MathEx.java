package com.company;

public class MathEx {
    public static int digitSwapper(int input) {
        int ones = (input % 100) % 10;
        int inputExtra = ones;
        ones *= 10;
        int tens = (input % 100) - ones;
        input -= tens
        tens /= 10;
        System.out.println(input);
    }
}