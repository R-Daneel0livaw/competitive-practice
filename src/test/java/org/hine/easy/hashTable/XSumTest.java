package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class XSumTest {

    @Test
    void testXSum() {
        var nums = new int[] {1, 1, 2, 2, 3, 4, 2, 3};
        var k = 6;
        var x = 2;
        var expected = new int[] {6, 10, 12};
        var actual = new XSum().findXSum(nums, k, x);

        assertArrayEquals(expected, actual);
    }
}
