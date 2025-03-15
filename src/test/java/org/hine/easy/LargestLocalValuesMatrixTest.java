package org.hine.easy;

import org.hine.easy.matrix.LargestLocalValuesMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LargestLocalValuesMatrixTest {

    @Test
    void testLargestLocalValuesMatrix() {
        var grid = new int[][] {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        var expected = new int[][] {{9, 9}, {8, 6}};
        var actual = new LargestLocalValuesMatrix().largestLocal(grid);

        assertArrayEquals(expected, actual);
    }
}
