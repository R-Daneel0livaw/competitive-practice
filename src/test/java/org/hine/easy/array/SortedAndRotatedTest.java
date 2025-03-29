package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedAndRotatedTest {

    @Test
    void testSortedAndRotated() {
        var nums = new int[] {3, 4, 5, 1, 2};
        var expected = true;
        var actual = new SortedAndRotated().isSortedAndRotated(nums);

        assertEquals(expected, actual);
    }
}
