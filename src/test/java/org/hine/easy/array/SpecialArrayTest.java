package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArrayTest {

    @Test
    void testSpecialArray() {
        var nums = new int[] {2, 1, 4};
        var expected = true;
        var actual = new SpecialArray().isArraySpecial(nums);

        assertEquals(expected, actual);
    }
}
