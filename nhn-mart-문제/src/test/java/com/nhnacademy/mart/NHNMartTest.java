package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NHNMartTest {

    @Test
    @DisplayName("NHNMart FoodStand 테스트")
    public void foodStandTest() {
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();
        Assertions.assertEquals("양파", nhnMart.getFoodStand().getFoodStand().get(0).getName());
        Assertions.assertEquals(1_000, nhnMart.getFoodStand().getFoodStand().get(0).getPrice());
    }
}
