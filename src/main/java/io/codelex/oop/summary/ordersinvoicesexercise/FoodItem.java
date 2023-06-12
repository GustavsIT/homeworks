package io.codelex.oop.summary.ordersinvoicesexercise;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate expirationDate;

    public FoodItem(String name, BigDecimal price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, best before: " + expirationDate;
    }
}
