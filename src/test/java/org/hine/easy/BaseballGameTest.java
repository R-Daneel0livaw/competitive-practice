package org.hine.easy;

import org.hine.easy.stack.BaseballGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseballGameTest {

    @Test
    void testBaseballGame() {
        var ops = new String[]{"5","2","C","D","+"};
        var expected = 30;
        var actual = new BaseballGame().baseballGame(ops);

        assertEquals(expected, actual);
    }
}