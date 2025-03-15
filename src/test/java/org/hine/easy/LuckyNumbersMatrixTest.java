package org.hine.easy;

import org.hine.easy.matrix.LuckyNumbersMatrix;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuckyNumbersMatrixTest {

    @Test
    void testLuckyNumbersMatrix() {
        var matrix = new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        var expected = List.of(15);
        var actual = new LuckyNumbersMatrix().luckyNumbersMatrix(matrix);
        assertEquals(expected, actual);
    }
}
