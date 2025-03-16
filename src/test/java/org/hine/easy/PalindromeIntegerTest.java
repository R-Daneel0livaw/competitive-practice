package org.hine.easy;

import org.hine.easy.math.PalindromeInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeIntegerTest {

    @Test
    void testPalindromeInteger() {
        var x = 121;
        var expected = true;
        var actual = new PalindromeInteger().palindromeInteger(x);

        assertEquals(expected, actual);
    }
}
