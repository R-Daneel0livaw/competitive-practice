package org.hine.easy;

import org.hine.easy.bitManipulation.PowerOf2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOf2Test {

    @Test
    void testPowerOf2() {
        var n1 = 16;
        var expected1 = true;
        var actual1 = new PowerOf2().powerOfTwo(n1);
        assertEquals(expected1, actual1);

        var n2 = 10;
        var expected2 = false;
        var actual2 = new PowerOf2().powerOfTwo(n2);
        assertEquals(expected2, actual2);
    }
}
