package org.hine.easy.sorting;

import org.hine.easy.sorting.BuyTwoChocolates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuyTwoChocolatesTest {

    @Test
    void testBuyTwoChocolates() {
        var prices = new int[]{1, 2, 2};
        var money = 3;

        var expected = 0;
        var actual = new BuyTwoChocolates().buyTwoChocolates(prices, money);

        assertEquals(expected, actual);
    }
}