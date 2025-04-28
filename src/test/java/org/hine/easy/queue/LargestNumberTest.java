package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    void testLargestNumber() {
        var num = 65875;
        var expected = 87655;
        var actual = new LargestNumber().largestInteger(num);

        assertEquals(expected, actual);
    }
}
