package org.hine.easy;

import org.hine.easy.queue.MakeArrayZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MakeArrayZeroTest {

    @Test
    void testMakeArrayZero() {
        var nums = new int[] {1, 5, 0, 3, 5};

        var expected = 3;
        var actual = new MakeArrayZero().makeArrayZero(nums);

        assertEquals(expected, actual);
    }
}