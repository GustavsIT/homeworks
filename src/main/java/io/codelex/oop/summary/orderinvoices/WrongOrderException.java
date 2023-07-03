package io.codelex.oop.summary.orderinvoices;

public class WrongOrderException extends Exception {

    public WrongOrderException() {
        super("Order is empty!");
    }

}
