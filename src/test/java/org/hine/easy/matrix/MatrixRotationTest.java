package org.hine.easy.matrix;

import org.hine.easy.matrix.MatrixRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixRotationTest {

    @Test
    void testMatrixRotation() {
        var mat = new int[][] {{0, 1}, {1, 0}};
        var target = new int[][] {{1, 0}, {0, 1}};
        var expected = true;
        var actual = new MatrixRotation().findRotation(mat, target);

        assertEquals(expected, actual);
    }
}
