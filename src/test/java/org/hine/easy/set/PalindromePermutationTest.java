package org.hine.easy.set;

import org.hine.easy.set.PalindromePermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromePermutationTest {

    @Test
    void testPalindromePermutation() {
        var s1 = "code";
        var expected1 = false;
        var actual1 = new PalindromePermutation().palindromePermutation(s1);

        assertEquals(expected1, actual1);

        var s2 = "carerac";
        var expected2 = false;
        var actual2 = new PalindromePermutation().palindromePermutation(s2);

        assertEquals(expected2, actual2);
    }
}
