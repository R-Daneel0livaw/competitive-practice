package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterTest {

    @Test
    void testFirstUniqueCharacter() {
        String s = "loveleetcode";

        int expected = 2;
        int actual = new FirstUniqueCharacter().firstUniqueCharacter(s);

        assertEquals(expected, actual);
    }
}