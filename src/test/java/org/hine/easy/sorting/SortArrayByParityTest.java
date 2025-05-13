package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayByParityTest {

    @Test
    void testSortArrayByParity() {
        var nums = new int[] {3, 1, 2, 4};
        var expected = new int[] {4, 2, 1, 3};
        var actual = new SortArrayByParity().sortArrayByParity(nums);

        assertArrayEquals(expected, actual);
    }
}
