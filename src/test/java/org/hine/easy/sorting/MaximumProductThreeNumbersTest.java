package org.hine.easy.sorting;

import org.hine.easy.sorting.MaximumProductThreeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumProductThreeNumbersTest {

    @Test
    void testMaximumProductThreeNumbers() {
        var nums = new int[]{1, 2, 3, 4};

        var expected = 24;
        var actual = new MaximumProductThreeNumbers().maximumProductThreeNumbers(nums);

        assertEquals(expected, actual);
    }
}