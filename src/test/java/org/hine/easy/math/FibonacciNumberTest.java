package org.hine.easy.math;

import org.hine.easy.math.FibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {

    @Test
    void testFibonacciNumber() {
        var n = 4;
        var expected = 3;
        var actual = new FibonacciNumber().fibNum(n);

        assertEquals(expected, actual);
    }
}
