package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter some text here:");
        String userInput = in.nextLine();
        int bigLetterCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char soloLetter = userInput.charAt(i);
            if (Character.isUpperCase(soloLetter)) {

                bigLetterCounter++;
            }
        }
        System.out.println("Number of uppercase letters in this text is: " + bigLetterCounter);
    }
}
