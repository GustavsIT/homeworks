package io.codelex.oop.summary.orderinvoices;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, color:" + color;
    }
}