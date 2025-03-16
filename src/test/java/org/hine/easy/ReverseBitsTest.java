package org.hine.easy;

import org.hine.easy.bitManipulation.ReverseBits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {

    @Test
    void testReverseBits() {
        var n = 0b00000010100101000001111010011100;
        var expected = 0b00111001011110000010100101000000;
        var actual = new ReverseBits().reverseBits(n);

        assertEquals(expected, actual);
    }
}
