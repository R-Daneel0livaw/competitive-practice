package org.hine.easy.array;

import org.hine.easy.array.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void testBinarySearch() {
        var nums = new int[] {-1, 0, 3, 5, 9, 12};
        var target = 9;
        var expected = 4;
        var actual = new BinarySearch().binarySearch(nums, target);

        assertEquals(expected, actual);
    }
}
