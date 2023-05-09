package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your weight in KGs");
        double weightKg = in.nextDouble();
        System.out.println("Enter your height in CMs ");
        double heightCm = in.nextDouble();
        double weightLbs = weightKg * 2.2;
        double heightInches = heightCm * 0.393701;
        double bmi = (double) (weightLbs * 703) / Math.pow(heightInches, 2);
        if (bmi < 18.5) {
            System.out.printf("You are considered underweight, your BMI is: %.2f\n", bmi);
        }
        if (bmi > 18.5 && bmi < 25) {
            System.out.printf("You are considered optimal, your BMI is: %.2f\n", bmi);
        }
        if (bmi > 25) {
            System.out.printf("You are considered overweight, your BMI is: %.2f\n", bmi);
        }

    }
}
