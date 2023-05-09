package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        System.out.println("Please enter first number (0-9):");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Please enter second number (0-9):");
        int num2 = in.nextInt();
        System.out.println("Please enter third number (0-9):");
        int num3 = in.nextInt();
        if (num1 > 9 || num2 > 9 || num3 > 9) {
            System.out.println("There has been an error, please provide only SOLO DIGIT numbers");
        } else if (num1 >= 0 && num1 <= 9 && num2 >= 0 && num2 <= 9 && num3 >= 0 && num3 <= 9) {
            int sum = num1 + num2 + num3;
            System.out.println("Sum of your numbers is:" + sum);
        }


    }
}
