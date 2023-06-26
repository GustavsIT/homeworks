package io.codelex.testCodelex.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addToBasket(T item) throws BasketFullException {
        if (items.size() >= 10) {
            throw new BasketFullException("Basket is already full!");
        }
        items.add(item);
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (items.size() == 0) {
            throw new BasketEmptyException("Basket is already empty!");
        }
        if (items.remove(item)) {

        }
    }

    public int getItemCount() {
        return items.size();
    }
}
