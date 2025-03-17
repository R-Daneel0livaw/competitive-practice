package org.hine.easy.matrix;

public class TicTacToe {

    public String ticTacToe(int[][] moves) {
        var n = 3;
        var rows = new int[n];
        var cols = new int[n];
        var diag = 0;
        var antiDiag = 0;
        var player = 1;

        for (int[] move : moves) {
            var row = move[0];
            var col = move[1];

            rows[row] += player;
            cols[col] += player;

            if (row == col) diag += player;

            if (row + col == n - 1) antiDiag += player;

            if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n
                    || Math.abs(diag) == n || Math.abs(antiDiag) == n) {
                return player == 1 ? "A" : "B";
            }

            player *= -1;
        }
        return moves.length == n * n ? "Draw" : "Pending";
    }
}
