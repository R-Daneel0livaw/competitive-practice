package org.hine.easy;

import org.hine.easy.string.AddStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddStringsTest {

    @Test
    void testAddStrings() {
        var num1 = "456";
        var num2 = "77";

        var expected = "533";
        var actual = new AddStrings().addStrings(num1, num2);

        assertEquals(expected, actual);
    }
}
