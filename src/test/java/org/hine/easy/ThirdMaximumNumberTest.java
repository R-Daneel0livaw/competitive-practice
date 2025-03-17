package org.hine.easy;

import org.hine.easy.sorting.ThirdMaximumNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThirdMaximumNumberTest {

    @Test
    void testThirdMaximumNumber() {
        var nums = new int[] {2, 2, 3, 1};

        var expected = 1;
        var actual = new ThirdMaximumNumber().thirdMaximumNumber(nums);

        assertEquals(expected, actual);
    }
}