package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeExe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start date (yyyy-MM-dd):");
        LocalDate startDate = LocalDate.parse(scanner.next());
        System.out.print("Enter end date (yyyy-MM-dd):");
        LocalDate endDate = LocalDate.parse(scanner.next());
        int workingHours = calculateWorkingHours(startDate, endDate);
        System.out.println("Total working hours:" + workingHours);
    }

    public static int calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        int workingHours = 0;
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingHours += 8;
            }
            currentDate = currentDate.plusDays(1);
        }
        return workingHours;
    }

}
