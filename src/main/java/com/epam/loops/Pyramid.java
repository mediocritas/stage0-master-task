package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int j = 0; j < cathetusLength; j++) {
            for (int i = 0; i < cathetusLength; i++) {
                if (i >= cathetusLength - 1 - j) {
                    System.out.print(cathetusLength - i);
                } else {
                    System.out.print(' ');
                }
            }
            for (int i = 1; i < cathetusLength; i++) {
                if (i <= j) {
                    System.out.print( i + 1);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
