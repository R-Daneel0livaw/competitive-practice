package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsDifferenceTest {

    @Test
    void testMinimumAbsDifference() {
        var arr = new int[] {4, 2, 1, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3, 4));
        var actual = new MinimumAbsDifference().minAbsDifference(arr);

        assertEquals(expected, actual);
    }
}
