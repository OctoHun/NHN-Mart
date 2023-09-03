package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    @DisplayName("상품이 부족할 때 Test")
    public void noEnoughFoodInFoodStand() {
        FoodStand foodStand = new FoodStand();
        Food food = new Food("감자", 200);
        foodStand.add(food);
        BuyList buyList = new BuyList();
        buyList.add(new BuyList.Item("감자", 2));
        Customer customer = new Customer(buyList);

        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(foodStand));
    }

    @Test
    @DisplayName("상품이 존재하지 않을 때 Test")
    public void noFoodInFoodStand() {
        FoodStand foodStand = new FoodStand();
        Food food = new Food("감자", 200);
        foodStand.add(food);
        BuyList buyList = new BuyList();
        buyList.add(new BuyList.Item("양파", 1));
        Customer customer = new Customer(buyList);

        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(foodStand));
    }
}
