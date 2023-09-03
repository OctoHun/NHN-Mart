package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuyListTest {

    @Test
    @DisplayName("BuyList add 테스트")
    public void buyListAdd() {
        BuyList buyList = new BuyList();
        BuyList.Item item = new BuyList.Item("감자", 2);
        buyList.add(item);

        Assertions.assertEquals("감자", buyList.getItems().get(0).getName());
        Assertions.assertEquals(2, buyList.getItems().get(0).getAmount());
    }

    @Test
    @DisplayName("Item 생성 테스트")
    public void ItemConstructor() {
        BuyList.Item item = new BuyList.Item("감자", 2);

        Assertions.assertEquals("감자", item.getName());
        Assertions.assertEquals(2, item.getAmount());
    }
}
