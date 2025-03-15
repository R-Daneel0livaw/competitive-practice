package org.hine.easy;

import org.hine.easy.matrix.FloodFill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFillTest {

    @Test
    void testFloodFill() {
        var image = new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        var sr = 1; var sc = 1; var color = 2;
        var expected = new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        var actual = new FloodFill().floodFill(image, sr, sc, color);

        assertArrayEquals(expected, actual);
    }
}
