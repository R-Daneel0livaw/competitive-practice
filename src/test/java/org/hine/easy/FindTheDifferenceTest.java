package org.hine.easy;

import org.hine.easy.bitManipulation.FindTheDifference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceTest {

    @Test
    void testFindTheDifference() {
        var s = "abcd";
        var t = "abcde";
        var expected = 'e';
        var actual = new FindTheDifference().findTheDifference(s, t);

        assertEquals(expected, actual);
    }
}
