package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinTimeFillCupsTest {

    @Test
    void testMinTimeFillCups() {
        var cups = new int[] {5, 4, 4};
        var expected = 7;
        var actual = new MinTImeFillCups().fillCups(cups);

        assertEquals(expected, actual);
    }
}
