package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimilarStringsTest {

    @Test
    void testSimilarStrings() {
        var words = new String[] {"aba","aabb","abcd","bac","aabc"};
        var expected = 2;
        var actual = new SimilarStrings().similarStrings(words);

        assertEquals(expected, actual);
    }
}
