package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

    @Test
    void testLongestPalindrome() {
        var s = "abccccdd";
        var expected = 7;
        var actual = new LongestPalindrome().longestPalindrome(s);

        assertEquals(expected, actual);
    }
}
