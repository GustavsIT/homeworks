package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();
        playGame(keyboard);

    }

    public static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void playGame(Scanner keyboard) {
        char currentPlayer = 'X';
        int movesCount = 0;

        while (true) {
            System.out.println("Player '" + currentPlayer + "', it's your turn.");
            System.out.print("Enter the row number (0-2): ");
            int row = keyboard.nextInt();
            System.out.print("Enter the column number (0-2): ");
            int column = keyboard.nextInt();
            System.out.println();

            if (isValidMove(row, column)) {
                makeMove(row, column, currentPlayer);
                displayBoard();
                if (isWinningMove(row, column, currentPlayer)) {
                    System.out.println("Player '" + currentPlayer + "' wins!");
                    break;
                }
                if (movesCount == 8) {
                    System.out.println("The game is a tie.");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                movesCount++;
            } else {
                System.out.println("Invalid move. Please enter valid row and column numbers.");
            }
        }
    }


    public static boolean isValidMove(int row, int column) {
        return row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ';
    }

    public static void makeMove(int row, int column, char player) {

        board[row][column] = player;
    }

    public static boolean isWinningMove(int row, int column, char player) {
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
            return true;
        }
        if (board[0][column] == player && board[1][column] == player && board[2][column] == player) {
            return true;
        }
        if (row == column && board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (row + column == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}