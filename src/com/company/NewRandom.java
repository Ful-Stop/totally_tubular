package com.company;

public class NewRandom {


    public static void main(String[] args) {

        double r = Math.random();   //[0.0, 1.0)
        System.out.println(r);
        r = Math.random() * 10;    //[0.0, 10.0)
        System.out.println(r);
        int p = (int)(Math.random()*10);   //[0, 9)
        System.out.println(p);
        p = (int)(Math.random()*10) +1;   //[1, 10)
        System.out.println(p);
        p = (int)(Math.random()*10) +21;   //[21, 30)
        System.out.println(p);
    }
}
