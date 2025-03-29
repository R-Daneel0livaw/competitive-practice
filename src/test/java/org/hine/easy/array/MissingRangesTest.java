package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingRangesTest {

    @Test
    void testMissingRanges() {
        var nums = new int[] {0, 1, 3, 50, 75};
        var lower = 0;
        var upper = 99;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(4, 49));
        expected.add(Arrays.asList(51, 74));
        expected.add(Arrays.asList(76, 99));
        var actual = new MissingRanges().findMissingRanges(nums, lower, upper);

        assertEquals(expected, actual);
    }
}
