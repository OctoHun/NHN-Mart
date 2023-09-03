package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    @DisplayName("Basket add 테스트")
    public void basketAdd() {
        Basket basket = new Basket();
        Food food = new Food("감자", 200);
        basket.add(food);
        Assertions.assertEquals("감자", basket.getFoods().get(0).getName());
        Assertions.assertEquals(200, basket.getFoods().get(0).getPrice());
    }
}
