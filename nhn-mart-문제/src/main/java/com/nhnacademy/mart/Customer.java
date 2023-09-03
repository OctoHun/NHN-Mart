package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    private int Money = 20000;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item :buyList.getItems()) {
            String name = item.getName();
            int amount = item.getAmount();
            int count = 0;
            Food target = null;
            for (Food food : foodStand.getFoodStand()) {
                if (name.equals(food.getName())) {
                    count += 1;
                    target = food;
                }
            }
            if (count == 0) {
                logger.warn("검색 실패! 상품이 존재하지 않음");
                throw new IllegalArgumentException("매대에 상품이 존재하지 않습니다.");
            } else if (count < amount) {
                logger.warn("탐색 결과: 개수가 부족함");
                throw new IllegalArgumentException("재고가 " + (amount - count) + "개 부족합니다.");
            } else {
                for (int i = 0; i < amount; i++) {
                    basket.add(target);
                }
            }

        }

    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        int totalPrice = 0;
        for (Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }
        int result = counter.pay(Money, totalPrice);
        Money = result;
    }
}
