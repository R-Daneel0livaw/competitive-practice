package org.hine.easy.matrix;

import org.hine.easy.matrix.ToeplitzMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToeplitzMatrixTest {

    @Test
    void testToeplitzMatrix() {
        var matrix = new int[][] {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        var expected = true;
        var actual = new ToeplitzMatrix().isToeplitzMatrix(matrix);

        assertEquals(expected, actual);
    }
}
