package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Hey, there! Welcome to Piglet!");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int rolledScore = 0;
        int totalScore = 0;

        while (true) {
            int randomNumber = random.nextInt(6) + 1;

            if (randomNumber == 1) {
                System.out.println("You rolled a " + randomNumber + " !");
                rolledScore = 0;
                System.out.println("You got 0 points!");
                break;
            } else {
                rolledScore += randomNumber;
                System.out.println("You rolled a " + randomNumber + " !");
                System.out.println("Roll again? (yes/no)");
                String rollAgainYesOrNo = in.nextLine();

                if (rollAgainYesOrNo.equalsIgnoreCase("no")) {
                    totalScore += rolledScore;
                    break;
                }
            }
        }
        System.out.println("Your total score is: " + totalScore);
    }
}