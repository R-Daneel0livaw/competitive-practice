package org.hine.easy;

import org.hine.easy.math.Sqrt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest {

    @Test
    void testSqrt() {
        var x = 8;
        var expected =  2;
        var actual = new Sqrt().sqrt(x);

        assertEquals(expected, actual);
    }
}
