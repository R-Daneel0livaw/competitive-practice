package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {

    @Test
    void testJewelsAndStones() {
        var jewels = "aA";
        var stones = "aAAbbbb";
        var expected = 3;
        var actual = new JewelsAndStones().jewelsAndStones(jewels, stones);

        assertEquals(expected, actual);
    }
}
