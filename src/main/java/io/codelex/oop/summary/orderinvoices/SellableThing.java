package io.codelex.oop.summary.orderinvoices;

import java.math.BigDecimal;

public interface SellableThing {
    String getName();

    BigDecimal getPrice();

    String getFullInfo();
}