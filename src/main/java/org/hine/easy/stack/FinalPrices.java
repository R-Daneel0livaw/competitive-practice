package org.hine.easy.stack;

import java.util.Stack;

public class FinalPrices {

    public int[] finalPrices(int[] prices) {
        var result = prices.clone();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                result[stack.pop()] -= prices[i];
            }
            stack.add(i);
        }
        return result;
    }
}
