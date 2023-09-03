package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    @DisplayName("pay 메서드 금액 계산 Test")
    public void payTest() {
        Counter counter = new Counter();
        Assertions.assertEquals(10, counter.pay(20, 10));
    }

    @Test
    @DisplayName("pay 소지금이 부족한 경우 Test")
    public void noMoneyTest() {
        Counter counter = new Counter();
        Assertions.assertThrows(IllegalArgumentException.class, () -> counter.pay(10, 20));
    }
}
