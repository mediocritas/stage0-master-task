package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int powered = 1;
        for (int i=0; i < power; i++) {
            powered = powered *numberToPrint;
        }
        System.out.println(powered);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
