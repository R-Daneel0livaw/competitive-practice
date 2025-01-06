package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComplementTest {

    @Test
    void testNumberComplement() {
        var n = 5;
        var expected = 2;
        var actual = new NumberComplement().numberComplement(n);

        assertEquals(expected, actual);
    }
}
