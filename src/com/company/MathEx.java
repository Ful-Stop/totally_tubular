package com.company;

public class MathEx {
    public static int digitSwapper(int input) {
        int ones = input % 10;
        int tens = (input % 100) - ones;
        int inputExtra = input - ones - tens;
        ones *= 10;
        tens /= 10;
        int finalValue = inputExtra + tens + ones;
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
        int dateDOTW = (date - 1 + DOTW) % 7;
        System.out.println(dateDOTW);
        return dateDOTW;
    }

    public static void main(String[] args) {

        int input = 6;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        dayOfWeek(0,1);
        dayOfWeek(0,14);
        dayOfWeek(6, 22);
        dayOfWeek(5, 4);
        dayOfWeek(1,24);
        dayOfWeek(2,1);

    }
}

/*
6 60
381 318
6 hours 46 minute(s)
3 hours 21 minute(s)
0
6
6
1
3
2
 */