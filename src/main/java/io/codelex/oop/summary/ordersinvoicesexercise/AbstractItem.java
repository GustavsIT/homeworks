package io.codelex.oop.summary.ordersinvoicesexercise;

import java.math.BigDecimal;

abstract public class AbstractItem implements Item {
    String name;
    BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public abstract String getFullInfo();
}
