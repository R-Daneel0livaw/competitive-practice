package org.hine.easy;

import org.hine.easy.string.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @Test
    void testLongestCommonPrefix() {
        var strs = new String[] {"flower","flow","flight"};

        var expected = "fl";
        var actual = new LongestCommonPrefix().longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }
}
