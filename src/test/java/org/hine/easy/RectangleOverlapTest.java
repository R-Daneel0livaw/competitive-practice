package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleOverlapTest {

    @Test
    void testRectangleOverlap() {
        var rec1 = new int[] {0, 0, 2, 2};
        var rec2 = new int[] {1, 1, 3, 3};
        var expected = true;
        var actual = new RectangleOverlap().isRectangleOverlap(rec1, rec2);

        assertEquals(expected, actual);
    }
}
