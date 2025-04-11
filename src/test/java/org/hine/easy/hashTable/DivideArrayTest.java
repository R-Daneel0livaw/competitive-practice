package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideArrayTest {

    @Test
    void testDivideArray() {
        var nums = new int[] {3, 2, 3, 2, 2, 2};
        var expected = true;
        var actual = new DivideArray().divideArray(nums);

        assertEquals(expected, actual);
    }
}
