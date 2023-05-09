package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

public class CorporationEightExercise {
    public static void main(String[] args) {
        salaryCalculator(35, 7.50);
        salaryCalculator(47, 8.20);
        salaryCalculator(73, 10.00);

    }

    public static void salaryCalculator(int hoursWorked, double basePay) {
        if (basePay <= 8.00) {
            System.out.println("404 error!!! Wage is less than 8 dollars per hour, it is illegal!!!");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("404 error!!! GET A LIFE, YOU cannot work more than 60h....");
            return;
        }
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            double overtimePay = basePay * 1.5;
            totalPay = hoursWorked * basePay + overtimeHours * overtimePay;
        }
        System.out.printf("Your total salary is: %.2f dollars.\n", totalPay);
    }
}
