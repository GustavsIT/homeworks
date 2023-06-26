package io.codelex.testCodelex.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int cardNumber, String owner, int ccv, BigDecimal balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.takeMoney(amount);
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
