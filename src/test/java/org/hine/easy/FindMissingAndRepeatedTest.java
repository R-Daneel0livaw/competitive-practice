package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindMissingAndRepeatedTest {

    @Test
    void testFindMissingAndRepeated() {
        var grid = new int[][] {{1, 3}, {2, 2}};
        var expected = new int[] {2, 4};
        var actual = new FindMissingAndRepeated().findMissingAndRepeated(grid);
        assertArrayEquals(expected, actual);
    }
}
