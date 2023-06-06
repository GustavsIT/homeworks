package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;


    private Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    private static void main(String[] args) {
        printProduct("banana", 1.1, 13);
        printProduct("Logitech mouse", 70.00, 14);
        printProduct("iPhone 5s", 999.99, 3);
        printProduct("Epson EB-U05", 440.46, 1);

    }

    private static void printProduct(String name, double priceAtStart, int amountAtStart) {
        System.out.println(name + " , price " + priceAtStart + " , amount " + amountAtStart);
    }
}
