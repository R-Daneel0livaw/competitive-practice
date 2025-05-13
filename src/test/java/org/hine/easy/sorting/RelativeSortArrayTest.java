package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RelativeSortArrayTest {

    @Test
    void testRelativeSortArray() {
        var arr1 = new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        var arr2 = new int[] {2, 1, 4, 3, 9, 6};
        var expected = new int[] {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        var actual = new RelativeSortArray().relativeSortArray(arr1, arr2);

        assertArrayEquals(expected, actual);
    }
}
