package org.hine.easy.matrix;

import org.hine.easy.matrix.IslandPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandPerimeterTest {

    @Test
    void testIslandPerimeter() {
        var grid = new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        var expected = 16;
        var actual = new IslandPerimeter().islandPerimeter(grid);

        assertEquals(expected, actual);
    }
}
