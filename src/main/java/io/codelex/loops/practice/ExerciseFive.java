package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = in.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = in.nextLine();

        String dot = ".";

        int lineLength = 30;
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();
        int dotLength = lineLength - firstWordLength - secondWordLength;

        System.out.println(firstWord + dot.repeat(dotLength) + secondWord);


    }
}
