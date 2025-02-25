package org.hine.easy;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost);
    }

    private int minCost(int i, int[] cost) {
        if (i <= 1) return 0;

        if (memo.containsKey(i)) return memo.get(i);

        var downOne = cost[i - 1] + minCost(i - 1, cost);
        var downTwo = cost[i - 2] + minCost(i - 2, cost);
        memo.put(i, Math.min(downOne, downTwo));
        return memo.get(i);
    }
}
