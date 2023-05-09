package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class EightExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of minutes you want to convert!");
        int minutes = in.nextInt();
        double days = minutes / 1440;
        double years = days / 365;
        System.out.printf("You have entered: " + minutes + " minutes, in days it is %.1f days and in years it is %.2f years.\n", days, years);
    }
}
