package org.hine.easy;

import org.hine.easy.sorting.SortedSquares;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortedSquaresTest {

    @Test
    void testSortedSquares() {
        var nums = new int[]{-4, -1, 0, 3, 10};

        var expected = new int[]{0, 1, 9, 16, 100};
        var actual = new SortedSquares().sortedSquares(nums);

        assertArrayEquals(expected, actual);
    }
}