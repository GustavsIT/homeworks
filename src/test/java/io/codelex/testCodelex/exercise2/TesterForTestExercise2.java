package io.codelex.testCodelex.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesterForTestExercise2 {

    @Test
    public void addToBasketTest() throws BasketFullException {
        Basket<Apple> appleBasket = new Basket<>();
        assertEquals(0, appleBasket.getItemCount());

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            appleBasket.addToBasket(apple);
            assertEquals(i + 1, appleBasket.getItemCount());
        }

        Apple extraApple = new Apple();
        assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(extraApple));

    }


    @Test
    public void removeFromBasketTest() throws BasketEmptyException, BasketFullException {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        assertEquals(0, mushroomBasket.getItemCount());
        assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket(new Mushroom()));

        Mushroom mushroom1 = new Mushroom();
        Mushroom mushroom2 = new Mushroom();
        mushroomBasket.addToBasket(mushroom1);
        mushroomBasket.addToBasket(mushroom2);
        assertEquals(2, mushroomBasket.getItemCount());
        mushroomBasket.removeFromBasket(mushroom1);
        assertEquals(1, mushroomBasket.getItemCount());
        mushroomBasket.removeFromBasket(mushroom2);
        assertEquals(0, mushroomBasket.getItemCount());

        assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket(new Mushroom()));
    }
}
