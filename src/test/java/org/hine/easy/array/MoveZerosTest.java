package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZerosTest {

    @Test
    void testMoveZeros() {
        var nums = new int[] {0, 1, 0, 3, 12};
        var expected = new int[] {1, 3, 12, 0, 0};
        var actual = new MoveZeros().moveZeros(nums);

        assertArrayEquals(expected, actual);
    }
}
