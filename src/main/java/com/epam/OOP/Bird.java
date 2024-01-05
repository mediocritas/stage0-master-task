package com.epam.OOP;

public class Bird extends Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Bird() {
        super();
        color = "blue";
        numberOfPaws = 2;
        hasFur = false;
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}