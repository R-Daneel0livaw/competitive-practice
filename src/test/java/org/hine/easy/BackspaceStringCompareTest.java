package org.hine.easy;

import org.hine.easy.stack.BackspaceStringCompare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackspaceStringCompareTest {

    @Test
    void testBackspaceStringCompare() {
        var s1 = "ab#c";
        var t1 = "ad#c";
        var expected1 = true;

        var s2 = "a#c";
        var t2 = "b";
        var expected2 = false;

        var actual1 = new BackspaceStringCompare().backspaceStringCompare(s1, t1);
        var actual2 = new BackspaceStringCompare().backspaceStringCompare(s2, t2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}