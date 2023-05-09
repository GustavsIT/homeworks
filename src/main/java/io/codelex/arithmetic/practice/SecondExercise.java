package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("this number is EVEN");
        } else {
            System.out.println("this number is ODD");
        }
        System.out.println("Bye");

    }
}
