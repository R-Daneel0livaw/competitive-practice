package org.hine.easy;

import org.hine.easy.sorting.MaxProductPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxProductPairsTest {

    @Test
    void testMaxProductPairs() {
        var nums = new int[]{4, 2, 5, 9, 7, 4, 8};

        var expected = 64;
        var actual = new MaxProductPairs().maxProductPairs(nums);

        assertEquals(expected, actual);
    }
}