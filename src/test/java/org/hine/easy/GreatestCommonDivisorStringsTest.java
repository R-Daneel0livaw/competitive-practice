package org.hine.easy;

import org.hine.easy.string.GreatestCommonDivisorStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreatestCommonDivisorStringsTest {

    @Test
    void testGreatestCommonDivisorStrings() {
        var str1 = "ABABAB";
        var str2 = "ABAB";

        var expected = "AB";
        var actual = new GreatestCommonDivisorStrings().greatCommonDivisorStrings(str1, str2);

        assertEquals(expected, actual);
    }
}
