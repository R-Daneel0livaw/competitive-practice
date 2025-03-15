package org.hine.easy;

import org.hine.easy.math.ClimbStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbStairsTest {

    @Test
    void testClimbStairs() {
        var n = 2;
        var expected = 2;
        var actual = new ClimbStairs().climbStairs(n);

        assertEquals(expected, actual);
    }
}
