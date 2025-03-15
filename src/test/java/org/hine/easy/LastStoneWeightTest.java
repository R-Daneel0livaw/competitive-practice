package org.hine.easy;

import org.hine.easy.queue.LastStoneWeight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastStoneWeightTest {

    @Test
    void testLastStoneWeight() {
        var stones = new int[] {2, 7, 4, 1, 8, 1};

        var expected = 1;
        var actual = new LastStoneWeight().lastStoneWeight(stones);

        assertEquals(expected, actual);
    }
}