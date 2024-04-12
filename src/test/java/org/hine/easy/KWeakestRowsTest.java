package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KWeakestRowsTest {

    @Test
    void testKWeakestRows() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        var k = 3;

        var expected = new int[]{2, 0, 3};
        var actual = new KWeakestRows().kWeakestRows(mat, k);

        assertArrayEquals(expected, actual);
    }
}