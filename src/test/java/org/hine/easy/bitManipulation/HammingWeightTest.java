package org.hine.easy.bitManipulation;

import org.hine.easy.bitManipulation.HammingWeight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HammingWeightTest {

    @Test
    void testHammingWeight() {
        var n = 11;
        var expected = 3;
        var actual = new HammingWeight().hammingWeight(n);

        assertEquals(expected, actual);
    }
}
