package org.hine.easy;

import org.hine.easy.sorting.AssignCookies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssignCookiesTest {

    @Test
    void tetAssignCookies() {
        var g = new int[]{1, 2};
        var s = new int[]{1, 2, 3};

        var expected = 2;
        var actual = new AssignCookies().assignCookies(g, s);

        assertEquals(expected, actual);
    }
}