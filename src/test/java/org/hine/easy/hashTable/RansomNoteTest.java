package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteTest {

    @Test
    void testRansomNote() {
        var ransomNote = "aa";
        var magazine = "aab";
        var expected = true;
        var actual = new RansomNote().ransomNote(ransomNote, magazine);

        assertEquals(expected, actual);
    }
}
