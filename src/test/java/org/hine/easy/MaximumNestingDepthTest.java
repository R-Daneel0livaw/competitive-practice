package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumNestingDepthTest {

    @Test
    void testMaximumNestingDepth() {
        var s = "(1+(2*3)+((8)/4))+1";
        var expected = 3;
        var actual = new MaximumNestingDepth().maximumNestingDepth(s);

        assertEquals(expected, actual);
    }
}