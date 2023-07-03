package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeExe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter launch date (yyyy-MM-dd):");
        LocalDate launchDate = LocalDate.parse(scanner.next());

        LocalDate firstUpdateDate = launchDate.plusWeeks(2);
        LocalDate secondUpdateDate = launchDate.plusWeeks(4);
        System.out.println("First update would be at " + firstUpdateDate);
        System.out.println("First update would be at " + secondUpdateDate);


    }

}
