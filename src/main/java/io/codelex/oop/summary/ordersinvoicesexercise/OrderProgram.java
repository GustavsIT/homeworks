package io.codelex.oop.summary.ordersinvoicesexercise;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {
        Order order = new Order();
        order.addItem(new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.parse("2024-04-01")));
        order.addItem(new ElectronicsItem("Radio", new BigDecimal("25.00"), 100));
        order.addItem(new HouseholdItem("Bucket", new BigDecimal("5.00"), "red"));
        order.addItem(new ItemPacking());
        Invoice invoice = new Invoice(order, "INV123");
        invoice.send();
        String formattedInvoice = invoice.getFormattedInvoiceText();
        System.out.println(formattedInvoice);


    }
}
