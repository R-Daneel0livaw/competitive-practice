package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RelativeRanksTest {

    @Test
    void testRelativeRanks() {
        var scores = new int[] {5, 4, 3, 2, 1};
        var expected = new String[] {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        var actual = new RelativeRanks().relativeRanks(scores);

        assertArrayEquals(expected, actual);
    }
}
