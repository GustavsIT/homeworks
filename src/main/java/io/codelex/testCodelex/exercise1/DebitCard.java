package io.codelex.testCodelex.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int cardNumber, String owner, int ccv, BigDecimal balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        super.addMoney(amount);
        BigDecimal sum = getBalance().add(amount);
        if (sum.compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
