package com.pluralsight;

public class Dice {
    //class fields
    private int maxValue;
    private int minValue;

    //parameterized constructor
    public Dice(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    //parameterless constructor for the Dice class
    public Dice() {
        this(1, 6); //constructor chaining
    }

    public int roll() {
        //picks a random number between 1 and 6
        return (int) (Math.random() * maxValue) + minValue;
    }

}
