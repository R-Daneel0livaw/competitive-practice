package org.hine.easy.string;

import org.hine.easy.string.FindWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindWordsTest {

    @Test
    void testFindWords() {
        var words = new String[]{"hello","world","leetcode"};
        var chars = "welldonehoneyr";

        var expected = 10;
        var actual = new FindWords().findWords(words, chars);

        assertEquals(expected, actual);
    }
}
