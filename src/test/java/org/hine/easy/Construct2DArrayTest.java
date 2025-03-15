package org.hine.easy;

import org.hine.easy.matrix.Construct2DArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Construct2DArrayTest {

    @Test
    void testConstruct2DArray() {
        var original = new int[] {1, 2, 3, 4};
        var m = 2; var n = 2;
        var expected = new int[][] {{1, 2}, {3, 4}};
        var actual = new Construct2DArray().construct2DArray(original, m, n);

        assertArrayEquals(expected, actual);
    }
}
