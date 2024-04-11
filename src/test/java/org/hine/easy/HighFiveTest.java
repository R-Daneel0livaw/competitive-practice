package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighFiveTest {

    @Test
    void testHighFive() {
        int[][] items = {
                {1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60},
                {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}
        };

        int[][] expected = {
                {1, 87}, {2, 88}
        };

        var actual = new HighFive().highFive(items);

        assertArrayEquals(expected, actual);
    }
}