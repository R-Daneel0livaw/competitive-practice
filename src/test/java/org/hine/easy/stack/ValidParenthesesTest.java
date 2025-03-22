package org.hine.easy.stack;

import org.hine.easy.stack.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    void testValidParentheses() {
        var s1 = "()()()";
        var s2 = "(((((()";

        var expected1 = true;
        var expected2 = false;

        var actual1 = new ValidParentheses().validParentheses(s1);
        var actual2 = new ValidParentheses().validParentheses(s2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}