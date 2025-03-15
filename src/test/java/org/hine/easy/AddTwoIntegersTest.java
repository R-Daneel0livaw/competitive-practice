package org.hine.easy;

import org.hine.easy.math.AddTwoIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoIntegersTest {

    @Test
    void testAddTwoIntegers() {
        var num1 = 12;
        var num2 = 5;
        var expected = 17;
        var actual = new AddTwoIntegers().addTwoIntegers(num1, num2);

        assertEquals(expected, actual);
    }
}
