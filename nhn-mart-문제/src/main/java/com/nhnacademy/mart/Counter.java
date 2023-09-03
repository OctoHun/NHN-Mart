package com.nhnacademy.mart;

public class Counter {


    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

    public int pay(int money, int totalPrice) {
        if (money < totalPrice) {
            throw new IllegalArgumentException("상품 금액이 소지금을 초과하였습니다.");
        }

        int result = money - totalPrice;

        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 : " + result);
        return result;
    }
}
