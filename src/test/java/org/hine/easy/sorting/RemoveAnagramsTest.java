package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAnagramsTest {

    @Test
    void testRemoveAnagrams() {
        var words = new String[] {"abba", "baba", "bbaa", "cd", "cd"};
        List<String> expected = new ArrayList<>();
        expected.add("abba");
        expected.add("cd");
        var actual = new RemoveAnagrams().removeAnagrams(words);

        assertEquals(expected, actual);
    }
}
