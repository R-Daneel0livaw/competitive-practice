package org.hine.easy;

import org.hine.easy.matrix.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {

    @Test
    void testTicTacToe() {
        var moves = new int[][] {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        var expected = "A";
        var actual = new TicTacToe().ticTacToe(moves);
        assertEquals(expected, actual);
    }
}
