package org.hine.easy.string;

import org.hine.easy.string.IsomorphicStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsomorphicStringsTest {

    @Test
    void testIsomorphicStrings() {
        var s = "paper";
        var t = "title";

        var expected = true;
        var actual = new IsomorphicStrings().isIsomorphic(s, t);

        assertEquals(expected, actual);
    }
}
