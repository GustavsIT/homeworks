package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    enum rps {
        ROCK,
        PAPER,
        SCISSORS,
    }

    public static void main(String[] args) {
        System.out.println("Let's play Scissors-Paper-Rock!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerWins = 0;
        int computerWins = 0;
        int totalGames = 0;

        while (true) {
            System.out.print("Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            } else if (!input.equalsIgnoreCase("s") && !input.equalsIgnoreCase("p") && !input.equalsIgnoreCase("r")) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            rps playerPick;
            switch (input.toLowerCase()) {
                case "s" -> playerPick = rps.SCISSORS;
                case "p" -> playerPick = rps.PAPER;
                case "r" -> playerPick = rps.ROCK;
                default -> playerPick = null;
            }

            rps computerPick = rps.values()[random.nextInt(rps.values().length)];
            System.out.println("Your pick: " + playerPick);
            System.out.println("PC turn: " + computerPick);

            if (playerPick == computerPick) {
                System.out.println("Tie!");
            } else if (
                    (playerPick == rps.SCISSORS && computerPick == rps.PAPER) ||
                            (playerPick == rps.PAPER && computerPick == rps.ROCK) ||
                            (playerPick == rps.ROCK && computerPick == rps.SCISSORS)
            ) {
                System.out.println("You won!");
                System.out.println(getWinningMessage(playerPick, computerPick));
                playerWins++;
            } else {
                System.out.println("PC won!");
                System.out.println(getWinningMessage(computerPick, playerPick));
                computerWins++;
            }

            totalGames++;
            System.out.println();
        }

        System.out.println("Number of trials: " + totalGames);
        System.out.print("You won " + playerWins + " games " + calculatePercentage(playerWins, totalGames) + " %. ");
        System.out.print("PC won " + computerWins + " games " + calculatePercentage(computerWins, totalGames) + " %. ");
        System.out.println();
        System.out.println("Bye!");
    }

    private static double calculatePercentage(int wins, int totalGames) {
        if (totalGames == 0) {
            return 0;
        }
        return (double) wins / totalGames * 100;
    }

    private static String getWinningMessage(rps winner, rps loser) {
        if ((winner == rps.ROCK && loser == rps.SCISSORS) ||
                (winner == rps.PAPER && loser == rps.ROCK) ||
                (winner == rps.SCISSORS && loser == rps.PAPER)) {
            return winner + " wins " + loser + "!";
        } else {
            return "";
        }
    }

}
