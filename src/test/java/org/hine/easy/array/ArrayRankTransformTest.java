package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayRankTransformTest {

    @Test
    void testArrayRankTransform() {
        var arr = new int[] {40, 10, 20, 30};
        var expected = new int[] {4, 1, 2, 3};
        var actual = new ArrayRankTransform().arrayRankTransform(arr);

        assertArrayEquals(expected, actual);
    }
}
