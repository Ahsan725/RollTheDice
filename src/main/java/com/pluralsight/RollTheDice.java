package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        //variables
        int roll1;
        int roll2;
        int count2 = 0, count4 = 0, count6 = 0, count7 = 0;

        //create an obj of Dice
        Dice dice = new Dice(); //creates a typical 6 sided dice

        for (var i = 0; i < 100; i++) {
            //roll the dice twice by calling the roll() method on dice obj
            roll1 = dice.roll();
            roll2 = dice.roll();
            //accumulate the sum of the two rolls
            var sum = roll1 + roll2;
            //print what the rolls were
            System.out.println("Roll 1: " + roll1 + ", Roll 2: " + roll2 + ", Sum: " + sum);
            //create a visual break to see if it matches the values we are interested in
            if (sum == 2 || sum == 4 || sum == 6 || sum == 7) {
                System.out.println("\nAha! just what I was looking for!\n");
            }
            //increment the counters if we got a desired number from the sum of the two rolls
            switch (sum) {
                case 2 -> count2 += 1;
                case 4 -> count4 += 1;
                case 6 -> count6 += 1;
                case 7 -> count7 += 1;
            }
        }
        //print results
        System.out.println("The count of 2s is: " + count2);
        System.out.println("The count of 4s is: " + count4);
        System.out.println("The count of 6s is: " + count6);
        System.out.println("The count of 7s is: " + count7);
    }
}
