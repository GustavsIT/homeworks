package io.codelex.testCodelex.exercise1;

import java.math.BigDecimal;

abstract public class Card {
    private int cardNumber;
    private String owner;
    private int ccv;
    private BigDecimal balance;

    public Card(int cardNumber, String owner, int ccv, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (balance.compareTo(amount) < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance = balance.subtract(amount);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
