package org.hine.easy;

import org.hine.easy.sorting.MaxVerticalArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxVerticalAreaTest {

    @Test
    void testMaxVerticalArea() {
        int[][] points = {
                {3, 1},
                {9, 0},
                {1, 0},
                {1, 4},
                {5, 3},
                {8, 8}
        };

        var expected = 3;
        var actual = new MaxVerticalArea().maxVerticalArea(points);

        assertEquals(expected, actual);
    }
}