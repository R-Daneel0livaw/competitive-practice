package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortArrayIncreasingFrequencyTest {

    @Test
    void testSortArrayIncreasingFrequency() {
        var nums = new int[]{2, 3, 1, 3, 2};

        var expected = new int[]{1, 3, 3, 2, 2};
        var actual = new SortArrayIncreasingFrequency().sortArrayIncreasingFrequency(nums);

        assertArrayEquals(expected, actual);
    }
}