package io.codelex.oop.summary.ordersinvoicesexercise;

public class WrongOrderException extends Exception {

    public WrongOrderException() {
        super("Order is empty!");
    }

}
