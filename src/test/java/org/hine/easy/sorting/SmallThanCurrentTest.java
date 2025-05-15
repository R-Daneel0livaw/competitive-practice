package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallThanCurrentTest {

    @Test
    void testSmallerThanCurrent() {
        var nums = new int[] {8, 1, 2, 2, 3};
        var expected = new int[] {4, 0, 1, 1, 3};
        var actual = new SmallerThanCurrent().smallerThanCurrent(nums);

        assertArrayEquals(expected, actual);
    }
}
