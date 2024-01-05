package com.epam.conditions;


public class DaysInMonth {
    public void printDays(int year, int month) {

        switch (month) {
            default:
                System.out.println("invalid date");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(31);
                break;
            case 2:
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
                System.out.println(isLeap ? 29 : 28);
                break;
            case 4, 6, 9, 11:
                System.out.println(30);
                break;

        }
    }
}