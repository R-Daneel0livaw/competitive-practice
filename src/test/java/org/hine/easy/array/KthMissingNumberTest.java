package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthMissingNumberTest {

    @Test
    void testKthMissingNumber() {
        var nums = new int[] {2, 3, 4, 7, 11};
        var k = 5;
        var expected = 9;
        var actual = new KthMissingNumber().kthMissingNumber(nums, k);

        assertEquals(expected, actual);
    }
}
