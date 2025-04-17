package org.hine.easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalPricesTest {

    @Test
    void testFinalPrices() {
        var prices = new int[] {8, 4, 6, 2, 3};
        var expected = new int[] {4, 2, 4, 2, 3};
        var actual = new FinalPrices().finalPrices(prices);

        assertArrayEquals(expected, actual);
    }
}
