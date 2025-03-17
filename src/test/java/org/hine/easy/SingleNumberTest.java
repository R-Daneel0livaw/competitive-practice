package org.hine.easy;

import org.hine.easy.bitManipulation.SingleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    void testSingleNumber() {
        var arr = new int[] {2, 2, 1};
        var expected = 1;
        var actual = new SingleNumber().singeNumber(arr);

        assertEquals(expected,actual);
    }
}
