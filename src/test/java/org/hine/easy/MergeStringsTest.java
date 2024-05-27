package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeStringsTest {

    @Test
    void testMergeStrings() {
        var word1 = "abc";
        var word2 = "pqr";

        var expected = "apbqcr";
        var actual = new MergeStrings().mergeStrings(word1, word2);

        assertEquals(expected, actual);
    }
}
