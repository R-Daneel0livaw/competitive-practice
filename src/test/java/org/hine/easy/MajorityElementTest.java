package org.hine.easy;

import org.hine.easy.hashTable.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    void testMajorityElement() {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int actual = new MajorityElement().majorityElement(arr);

        assertEquals(expected, actual);
    }
}