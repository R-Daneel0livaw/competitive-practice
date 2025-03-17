package org.hine.easy;

import org.hine.easy.hashTable.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAnagramTest {

    @Test
    void testValidAnagram() {
        String s = "anagram";
        String t = "nagaram";

        boolean expected = true;
        boolean actual = new ValidAnagram().validAnagram(s, t);

        assertEquals(expected, actual);
    }
}