package org.hine.easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePrefixTest {

    @Test
    void testReversePrefix() {
        var word = "abcdefd";
        var ch = 'd';
        var expected = "dcbaefd";
        var actual = new ReversePrefix().reversePrefix(word, ch);

        assertEquals(expected, actual);
    }
}
