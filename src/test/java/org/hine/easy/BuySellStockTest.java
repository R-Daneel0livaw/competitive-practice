package org.hine.easy;

import org.hine.easy.array.BuySellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStockTest {

    @Test
    void testBuySellStock() {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        assertEquals(expected1, new BuySellStock().buySellStock(nums1));

        int[] nums2 = {6, 5, 4, 3, 2, 1};
        int expected2 = 0;
        assertEquals(expected2, new BuySellStock().buySellStock(nums2));
    }
}