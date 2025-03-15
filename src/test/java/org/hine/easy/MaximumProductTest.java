package org.hine.easy;

import org.hine.easy.queue.MaximumProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumProductTest {

    @Test
    void testMaximumProduct() {
        var nums = new int[] {1, 5, 4, 5};

        var expected = 16;
        var actual = new MaximumProduct().maximumProduct(nums);

        assertEquals(expected, actual);
    }
}