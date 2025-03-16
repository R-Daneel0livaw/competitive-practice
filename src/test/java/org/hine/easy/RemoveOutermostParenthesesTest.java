package org.hine.easy;

import org.hine.easy.stack.RemoveOutermostParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveOutermostParenthesesTest {

    @Test
    void testRemoveOutermostParentheses() {
        var s = "(()())(())";
        var expected = "()()()";
        var actual = new RemoveOutermostParentheses().removeOutermostParentheses(s);

        assertEquals(expected, actual);
    }
}