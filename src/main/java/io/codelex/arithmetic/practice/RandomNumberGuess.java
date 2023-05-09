package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuess {
    public static void main(String[] args) {
        System.out.println("I am thinking of number between 1-100, I dare you to guess it!");
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        int randomNumber = randNum.nextInt(100) + 1;
        int userNumber = in.nextInt();
        if (randomNumber > userNumber) {
            System.out.println("Sorry, you are too low, I was thinking " + randomNumber);
        }
        if (randomNumber < userNumber) {
            System.out.println("Sorry, you are too high, I was thinking " + randomNumber);
        }
        if (randomNumber == userNumber) {
            System.out.println("Wow you guessed it! You are psychic!");
        }
    }
}
