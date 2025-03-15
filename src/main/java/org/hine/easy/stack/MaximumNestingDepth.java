package org.hine.easy.stack;

import java.util.Stack;

public class MaximumNestingDepth {

    public int maximumNestingDepth(String s) {
        var nestedMaxDepth = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                nestedMaxDepth = Math.max(nestedMaxDepth, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }
        return nestedMaxDepth;
    }
}