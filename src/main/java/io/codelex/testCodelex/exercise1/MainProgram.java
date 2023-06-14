package io.codelex.testCodelex.exercise1;

import java.math.BigDecimal;

public class MainProgram {
    public static void main(String[] args) throws NotEnoughFundsException {

        DebitCard debitCard = new DebitCard(123984422, "Joe", 123, BigDecimal.valueOf(100.00));
        debitCard.addMoney(BigDecimal.valueOf(10.00));
        debitCard.takeMoney(BigDecimal.valueOf(10.00));
        debitCard.addMoney(BigDecimal.valueOf(9999.99));

        CreditCard creditCard = new CreditCard(123445678, "Bob", 456, BigDecimal.valueOf(150.00));
        creditCard.takeMoney(BigDecimal.valueOf(10.00));
        creditCard.takeMoney(BigDecimal.valueOf(100.00));

    }
}
