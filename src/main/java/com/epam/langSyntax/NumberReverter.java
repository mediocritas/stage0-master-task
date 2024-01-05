package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {

        for (int i = 1; i < 3; i++) {
            System.out.print(number % 10);
            number = number / 10;
        }
        System.out.println(number);
    }
}
