package org.hine.easy.hashTable;

import org.hine.easy.hashTable.SetMismatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SetMismatchTest {

    @Test
    void testSetMismatch(){
        int[] nums = {1, 2, 2, 4};

        int[] expected = {2, 3};
        int[] actual = new SetMismatch().setMismatch(nums);

        assertArrayEquals(expected, actual);
    }
}