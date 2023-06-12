package io.codelex.oop.summary.ordersinvoicesexercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            LocalDate today = LocalDate.now();
            if (foodItem.getExpirationDate().isBefore(today)) {
                throw new BadFoodException();
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }

    public String getOrderText() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order contains:");
        for (SellableThing item : items) {
            sb.append("\n- ").append(item);
        }
        return sb.toString();
    }
}