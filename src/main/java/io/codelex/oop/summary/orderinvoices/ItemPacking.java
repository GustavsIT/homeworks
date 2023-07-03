package io.codelex.oop.summary.orderinvoices;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    static final String name = "Item packing";
    static final BigDecimal price = new BigDecimal("5.00");

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR";
    }
}
