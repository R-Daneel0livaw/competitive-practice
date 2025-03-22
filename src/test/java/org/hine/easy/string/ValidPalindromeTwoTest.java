package org.hine.easy.string;

import org.hine.easy.string.ValidPalindromeTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTwoTest {

    @Test
    void testValidPalindromeTwo() {
        var s = "abca";

        var expected = true;
        var actual = new ValidPalindromeTwo().validPalindrome(s);

        assertEquals(expected, actual);
    }
}
