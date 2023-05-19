package io.codelex.classesandobjects.practice.Exercise5;

import java.util.Scanner;

public class MainDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day(1-31): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Enter valid day!");
            return;
        }

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Enter valid month!");
            return;
        }

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if (year < 0 || year > 2023) {
            System.out.println("Enter valid year!");
            return;
        }

        Date.displayDate(day, month, year);

    }
}
