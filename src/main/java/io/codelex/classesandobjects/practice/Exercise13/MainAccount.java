package io.codelex.classesandobjects.practice.Exercise13;

import io.codelex.classesandobjects.practice.Exercise13.Account;

public class MainAccount {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());
        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);


        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        System.out.println("Matt's initial state: " + mattAccount);
        System.out.println("My initial state: " + myAccount);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.00);
        System.out.println("Matt's account balance got updated, it is now: " + mattAccount);
        System.out.println("My account balance got updated, it is now: " + myAccount);


        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);
        System.out.println("Initial state");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
        Account.transfer(accountA, accountB, 50.0);
        Account.transfer(accountB, accountC, 25.0);
        System.out.println("Final state");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

    }
}
