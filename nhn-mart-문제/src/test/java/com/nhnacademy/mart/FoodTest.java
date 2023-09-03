package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodTest {

    @Test
    @DisplayName("Food 생성 테스트")
    public void foodTest() {
        Food food = new Food("감자", 200);
        Assertions.assertEquals("감자", food.getName());
        Assertions.assertEquals(200, food.getPrice());
    }
}
