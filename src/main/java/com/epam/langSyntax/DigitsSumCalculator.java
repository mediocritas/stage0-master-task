package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sumOfDigits = 0;

        for (int i = 1; i <= 4; i++) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        System.out.println(sumOfDigits);
    }
}