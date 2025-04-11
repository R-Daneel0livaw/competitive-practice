package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostCommonWordTest {

    @Test
    void testMostCommonWord() {
        var paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        var banned = new String[] {"hit"};
        var expected = "ball";
        var actual = new MostCommonWord().mostCommonWord(paragraph, banned);

        assertEquals(expected, actual);
    }
}
