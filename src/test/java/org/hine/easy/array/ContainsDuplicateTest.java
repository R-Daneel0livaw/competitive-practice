package org.hine.easy.array;

import org.hine.easy.array.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicateTest {

    @Test
    void testContainsDuplicate() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean expected1 = false;
        boolean expected2 = true;

        boolean actual1 = new ContainsDuplicate().containsDuplicate(arr1);
        boolean actual2 = new ContainsDuplicate().containsDuplicate(arr2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);

    }
}