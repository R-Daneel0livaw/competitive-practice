package org.hine.easy;

import org.hine.easy.math.PassThePillow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassThePillowTest {

    @Test
    void testPassThePillow() {
        var n = 4;
        var time = 5;
        var expected = 2;
        var actual = new PassThePillow().passThePillow(n, time);

        assertEquals(expected, actual);
    }
}
