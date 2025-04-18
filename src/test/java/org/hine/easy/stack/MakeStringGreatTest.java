package org.hine.easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeStringGreatTest {

    @Test
    void testMakeStringGreat() {
        var s = "leEeetcode";
        var expected = "leetcode";
        var actual = new MakeStringGreat().makeGreat(s);

        assertEquals(expected, actual);
    }
}
