package org.hine.easy.sorting;

import org.hine.easy.sorting.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void testMissingNumber() {
        var nums = new int[]{1, 4, 3, 0, 6, 5};

        var expected = 2;
        var actual = new MissingNumber().missingNumber(nums);

        Assertions.assertEquals(expected, actual);
    }
}