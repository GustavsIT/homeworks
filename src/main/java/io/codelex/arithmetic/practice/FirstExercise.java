package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int number1 = in.nextInt();
        System.out.println("Enter 2nd number:");
        int number2 = in.nextInt();

        boolean result = isFifteen(number1, number2);
        System.out.println("One of numbers/sum/difference is 15 = " + result);
    }

    public static boolean isFifteen(int number1, int number2) {
        return number1 + number2 == 15 || number2 - number1 == 15 || number1 - number2 == 15 || number2 == 15 || number1 == 15;
    }
}
