package io.codelex.classesandobjects.practice.Exercise8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainProgramme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.print("How much money is in the account?: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("How long has the account been opened? ");
        int months = scanner.nextInt();

        SavingsAccount account = new SavingsAccount(initialBalance);
        account.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdrawals = 0;

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            totalWithdrawals += withdrawalAmount;

            account.calculateMonthlyInterest();
        }

        double endingBalance = account.getBalance();
        double interestEarned = endingBalance - initialBalance - totalDeposits + totalWithdrawals;

        System.out.println("Total deposited: EUR" + decimalFormat.format(totalDeposits));
        System.out.println("Total withdrawn: EUR" + decimalFormat.format(totalWithdrawals));
        System.out.println("Interest earned: EUR" + decimalFormat.format(interestEarned));
        System.out.println("Ending balance: EUR" + decimalFormat.format(endingBalance));
    }
}

