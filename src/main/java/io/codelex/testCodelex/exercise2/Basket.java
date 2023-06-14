package io.codelex.testCodelex.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items;
    private int itemCount;

    public Basket() {
        items = new ArrayList<>();
        itemCount = 0;
    }

    public void addToBasket(T item) throws BasketFullException {
        if (itemCount >= 10) {
            throw new BasketFullException("Basket is already full!");
        }
        items.add(item);
        itemCount++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (itemCount <= 0) {
            throw new BasketEmptyException("Basket is already empty!");
        }
        if (items.remove(item)) {
            itemCount--;
        }
    }

    public int getItemCount() {
        return itemCount;
    }
}
