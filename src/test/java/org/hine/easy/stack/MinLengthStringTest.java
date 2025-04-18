package org.hine.easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinLengthStringTest {

    @Test
    void testMinLengthString() {
        var s = "ABFCACDB";
        var expected = 2;
        var actual = new MinLengthString().minLength(s);

        assertEquals(expected, actual);
    }
}
