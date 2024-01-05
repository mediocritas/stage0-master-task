package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        for (int j = 0; j < cathetusLength; j++) {
            for (int i = 0; i < cathetusLength; i++) {
                if (i >= cathetusLength - 1 - j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
