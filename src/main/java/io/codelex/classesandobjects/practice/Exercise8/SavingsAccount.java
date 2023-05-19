package io.codelex.classesandobjects.practice.Exercise8;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " EUR successful.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " EUR successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (annualInterestRate / 12) * balance;
        balance += monthlyInterest;
        System.out.println("Monthly interest calculated and added to the balance.");
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
        System.out.println("Annual interest rate set to " + rate + "%.");
    }
}
