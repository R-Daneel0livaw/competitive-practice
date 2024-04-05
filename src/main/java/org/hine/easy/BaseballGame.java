package org.hine.easy;

import java.util.Stack;

public class BaseballGame {

    public int baseballGame(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if(op.equals("+")) {
                var top = stack.pop();
                var newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equalsIgnoreCase("C")) {
                stack.pop();
            } else if (op.equalsIgnoreCase("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}