package org.hine.easy;

import org.hine.easy.bitManipulation.MinBitFlips;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinBitFlipsTest {

    @Test
    void testMinBitFlips() {
        var start = 10;
        var goal = 7;
        var expected = 3;
        var actual = new MinBitFlips().minBitFlips(start, goal);
        assertEquals(expected, actual);
    }
}
