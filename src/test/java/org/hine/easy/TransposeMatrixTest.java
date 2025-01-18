package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransposeMatrixTest {

    @Test
    void testTransposeMatrix() {
        var matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        var expected = new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        var actual = new TransposeMatrix().transposeMatrix(matrix);

        assertArrayEquals(expected, actual);
    }
}
