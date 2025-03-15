package org.hine.easy;

import org.hine.easy.bitManipulation.AddBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    @Test
    void testAddBinary() {
        var a = "11";
        var b = "1";

        var expected = "100";
        var actual = new AddBinary().addBinary(a, b);

        assertEquals(expected, actual);
    }
}
