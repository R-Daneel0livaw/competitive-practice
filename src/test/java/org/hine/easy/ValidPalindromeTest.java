package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    @Test
    void testValidPalindrome() {
        var s = "A man, a plan, a canal: Panama";

        var expected = true;
        var actual = new ValidPalindrome().isPalindrome(s);

        assertEquals(expected, actual);
    }
}
