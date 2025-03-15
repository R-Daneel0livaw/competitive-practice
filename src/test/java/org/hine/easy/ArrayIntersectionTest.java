package org.hine.easy;

import org.hine.easy.hashTable.ArrayIntersection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayIntersectionTest {

    @Test
    void testArrayIntersectionTest() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        int[] expected = {4, 9};
        int[] actual = new ArrayIntersection().arrayIntersection(arr1, arr2);

        assertArrayEquals(expected, actual);
    }
}