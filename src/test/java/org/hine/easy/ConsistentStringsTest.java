package org.hine.easy;

import org.hine.easy.bitManipulation.ConsistentStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsistentStringsTest {

    @Test
    void testConsistentStrings() {
        var allowed = "ab";
        var words = new String[] {"ad", "bd", "aaab", "baa", "badab"};
        var expected = 2;
        var actual = new ConsistentStrings().consistentStrings(allowed, words);

        assertEquals(expected, actual);
    }
}
