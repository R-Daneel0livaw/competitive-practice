package org.hine.easy.sorting;

import org.hine.easy.sorting.FairCandySwap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FairCandySwapTest {

    @Test
    void testFairCandySwap() {
        var alice = new int[]{1, 2};
        var bob = new int[]{2, 3};

        var expected = new int[]{1, 2};
        var actual = new FairCandySwap().fairCandySwap(alice, bob);

        assertArrayEquals(expected, actual);
    }
}