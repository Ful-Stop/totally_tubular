package com.company;

public class MathEx {
    public static int digitSwapper(int input) {
        int ones = input % 10;
        int tens = (input % 100) - ones;
        int inputExtra = input - ones - tens;
        ones *= 10;
        tens /= 10;
        int finalValue = inputExtra + tens + ones;
        System.out.println(finalValue);
        return finalValue;
    }
    public static int timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int curTotal = curMin + (curHour * 60);
        int depTotal = depMin + (depHour * 60);
        int totalHour = (depTotal - curTotal) / 60;
        int totalMin = (depTotal - curTotal) % 60;
        System.out.println(totalHour + " hours " + totalMin + " minute(s)");
        return totalHour + totalMin;
    }
    public static int dayOfWeek(int DOTW, int date) {

    }

    public static void main(String[] args) {
        digitSwapper(143);
        timeLeft(2, 15, 6, 10);
    }
}