package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleExistsTest {

    @Test
    void testDoubleExists() {
        var nums = new int[] {10, 2, 5, 3};
        var expected = true;
        var actual = new DoubleExists().isDoubleExists(nums);

        assertEquals(expected, actual);
    }
}
