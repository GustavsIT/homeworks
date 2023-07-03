package io.codelex.oop.summary.orderinvoices;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {
    private int power;

    public ElectronicsItem(String name, BigDecimal price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, power:" + power + " W";
    }
}
