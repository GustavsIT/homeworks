package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("banana");
        wordList.add("pineapple");
        wordList.add("blueberry");
        wordList.add("cherry");
        wordList.add("pillow");
        wordList.add("computer");
        wordList.add("coding");

        String randomWord = chooseRandomWord(wordList);
        int remainingGuesses = 5;
        StringBuilder guessedWord = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            guessedWord.append("_");
        }
        List<Character> missedGuesses = new ArrayList<>();

        System.out.println("Let's start the Hangman game! Guess the word.");
        Scanner scanner = new Scanner(System.in);

        while (remainingGuesses > 0) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word: " + guessedWord.toString());
            System.out.println("Misses: " + missedGuesses.toString());
            System.out.println("Remaining guesses: " + remainingGuesses);

            System.out.print("Enter your guess: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Please enter a single letter!");
                continue;
            }

            char guess = input.charAt(0);

            if (Character.isLetter(guess)) {
                if (missedGuesses.contains(guess)) {
                    System.out.println("You already guessed that letter!");
                    continue;
                }

                boolean found = false;
                for (int i = 0; i < randomWord.length(); i++) {
                    if (randomWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                        found = true;
                    }
                }

                if (found) {
                    if (guessedWord.toString().equals(randomWord)) {
                        System.out.println("Congratulations! You guessed the word: " + randomWord);
                        break;
                    }
                } else {
                    missedGuesses.add(guess);
                    remainingGuesses--;
                }
            } else {
                System.out.println("Please enter a valid letter!");
            }
        }

        if (remainingGuesses == 0) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("You lost! The word was: " + randomWord);
        }
    }

    public static String chooseRandomWord(List<String> wordList) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.size());
        return wordList.get(randomIndex);
    }
}