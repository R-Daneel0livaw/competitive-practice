package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindTownJudgeTest {

    @Test
    void testFindTownJudge() {
        int[][] trust = {{1, 3}, {2, 3}};
        var n = 3;

        var expected = 3;
        var actual = new FindTownJudge().findTownJudge(n, trust);

        assertEquals(expected, actual);
    }
}
