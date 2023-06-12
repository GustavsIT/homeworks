package io.codelex.classesandobjects.practice.Exercise10;

public class MainAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Swedbank", 999999.99);
        Account account = new Account("Gustavs", 42.69);

        String accountInfo = "Bank account is at " + bankAccount.getName() + " with balance of: " + bankAccount.getBalance() + "EUR and the owner of this account is: " +
                account.getOwner() + " and their balance is: " + account.getBalance() + "EUR";

        System.out.println(accountInfo);
    }
}
