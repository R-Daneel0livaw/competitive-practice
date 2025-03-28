package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicate2Test {

    @Test
    void testContainsDuplicate2() {
        var nums = new int[] {1, 2, 3, 1};
        var k = 3;
        var expected = true;
        var actual = new ContainsDuplicate2().containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }
}
