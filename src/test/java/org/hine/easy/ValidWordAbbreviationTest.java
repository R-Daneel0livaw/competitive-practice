package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidWordAbbreviationTest {

    @Test
    void testValidWordAbbreviation() {
        var word = "internationalization";
        var abbr = "i12iz4n";

        var expected = true;
        var actual = new ValidWordAbbreviation().validWordAbbreviation(word, abbr);

        assertEquals(expected, actual);
    }
}
