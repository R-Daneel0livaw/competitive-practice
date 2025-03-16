package org.hine.easy;

import org.hine.easy.array.MinCostClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {

    @Test
    void testMinCostClimbingStairs() {
        var cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        var expected = 6;
        var actual = new MinCostClimbingStairs().minCostClimbingStairs(cost);

        assertEquals(expected, actual);
    }
}
