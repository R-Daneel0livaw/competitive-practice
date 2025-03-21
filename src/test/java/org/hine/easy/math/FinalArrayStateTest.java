package org.hine.easy.math;

import org.hine.easy.math.FinalArrayState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalArrayStateTest {

    @Test
    void testFinalArrayState() {
        var nums = new int[] {2, 1, 3, 5, 6};
        var k = 5;
        var multiplier = 2;
        var expected = new int[] {8, 4, 6, 5, 6};
        var actual = new FinalArrayState().finalArrayState(nums, k, multiplier);

        assertArrayEquals(expected, actual);
    }
}
