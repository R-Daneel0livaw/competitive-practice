package org.hine.easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClearDigitsTest {

    @Test
    void testClearDigits() {
        var s1 = "cb34";
        var expected1 = "";
        var actual1 = new ClearDigits().clearDigits(s1);

        assertEquals(expected1, actual1);

        var s2 = "7b8";
        var expected2 = "7";
        var actual2 = new ClearDigits().clearDigits(s2);

        assertEquals(expected2, actual2);
    }
}
