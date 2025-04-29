package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinNumberGameTest {

    @Test
    void testMinNumberGame() {
        var nums = new int[] {5, 4, 2, 3};
        var expected = new int[] {3, 2, 5, 4};
        var actual = new MinNumberGame().minNumberGame(nums);

        assertArrayEquals(expected, actual);
    }
}
