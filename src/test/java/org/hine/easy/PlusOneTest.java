package org.hine.easy;

import org.hine.easy.array.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    void testPlusOne() {
        int[] digits1 = {1, 0, 0, 2};
        int[] expected1 = {1, 0, 0, 3};
        Assertions.assertArrayEquals(expected1, new PlusOne().plusOne(digits1));

        int[] digits2 = {9, 9, 9, 9};
        int[] expected2 = {1, 0, 0, 0, 0};
        Assertions.assertArrayEquals(expected2, new PlusOne().plusOne(digits2));
    }
}