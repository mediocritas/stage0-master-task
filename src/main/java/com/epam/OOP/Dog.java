package com.epam.OOP;

public class Dog extends Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Dog() {
        super();
        color = "brown";
        numberOfPaws = 4;
        hasFur = true;
    }

    @Override
    public String getDescription() {
        return "This animal is mostly brown. It has 4 paws and a fur.";
    }
}