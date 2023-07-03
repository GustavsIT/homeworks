package io.codelex.oop.summary.orderinvoices;


public class BadFoodException extends Exception {
    public BadFoodException() {
        super("Bad food, date has expired!!!");
    }
}