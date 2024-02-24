package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    void testRomanToInteger() {
        String str1 = "LVIII";
        String str2 = "MCMXCIV";

        int expected1 = 58;
        int expected2 = 1994;

        int actual1 = new RomanToInteger().romanToInteger(str1);
        int actual2 = new RomanToInteger().romanToInteger(str2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}