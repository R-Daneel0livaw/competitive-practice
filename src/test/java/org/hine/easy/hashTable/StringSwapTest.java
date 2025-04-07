package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSwapTest {

    @Test
    void testStringSwap() {
        var s = "bank";
        var t = "kanb";
        var expected = true;
        var actual = new StringSwap().stringSwap(s, t);

        assertEquals(expected, actual);
    }
}
