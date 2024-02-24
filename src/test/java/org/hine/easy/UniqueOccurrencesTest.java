package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueOccurrencesTest {

    @Test
    void testUniqueOccurrences() {
       int[] arr1 =  {1, 2, 2, 1, 1, 3};
       int[] arr2 = {1, 2};

       boolean expected1 = true;
       boolean expected2 = false;

       boolean actual1 = new UniqueOccurrences().uniqueOccurrences(arr1);
       boolean actual2 = new UniqueOccurrences().uniqueOccurrences(arr2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}