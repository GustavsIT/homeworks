package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class NinthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gimme gimme gimme distance in meters");
        int distanceMeters = in.nextInt();
        System.out.println("Now about time, how many HOURS did you run?");
        int hours = in.nextInt();
        System.out.println("And how many minutes?");
        int minutes = in.nextInt();
        System.out.println("Every second counts, what about those? Tell me.");
        int seconds = in.nextInt();

        int totalSeconds = seconds + minutes * 60 + hours * 60 * 24;
        double metersPerSec = (double) distanceMeters / totalSeconds;
        System.out.printf("Your speed in meters/seconds: %.8f\n", metersPerSec);

        int totalHours = hours + (minutes / 60) + (seconds / (60 * 24));
        double kilometersPerHour = (double) (distanceMeters / 1000) / totalHours;
        System.out.printf("Your speed in kilometers/hours: %.8f\n ", kilometersPerHour);

        double miles = (double) distanceMeters / 1609;
        double milesPerHour = (double) miles / totalHours;
        System.out.printf("Your speed in miles/h is %.8f\n", milesPerHour);


    }
}
