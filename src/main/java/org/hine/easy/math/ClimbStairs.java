package org.hine.easy.math;

public class ClimbStairs {

    public int climbStairs(int n) {
        var memo = new int[n + 1];
        return climbStairsHelper(0, n, memo);
    }

    private int climbStairsHelper(int i, int n, int[] memo) {
        if (i > n) return 0;
        if (i == n) return 1;
        if (memo[i] > 0) return memo[i];

        memo[i] = climbStairsHelper(i + 1, n, memo) + climbStairsHelper(i + 2, n, memo);
        return memo[i];
    }
}
