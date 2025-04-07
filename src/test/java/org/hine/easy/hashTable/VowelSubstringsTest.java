package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelSubstringsTest {

    @Test
    void testVowelSubstrings() {
        var word = "cuaieuouac";
        var expected = 7;
        var actual = new VowelSubstrings().countVowelSubstrings(word);

        assertEquals(expected, actual);
    }
}
