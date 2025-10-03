package com.pluralsight;

public class Dice {
    private int maxValue;
    private int minValue;

    public Dice(){
        this.maxValue = 6;
        this.minValue = 1;
    }

    public int roll(){
        return (int)(Math.random() * maxValue) + minValue;
    }

}
