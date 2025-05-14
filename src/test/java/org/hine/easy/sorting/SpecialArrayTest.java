package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArrayTest {

    @Test
    void testSpecialArray() {
        var nums = new int[] {0, 4, 3, 0, 4};
        var expected = 3;
        var actual = new SpecialArray().specialArray(nums);

        assertEquals(expected, actual);
    }
}
