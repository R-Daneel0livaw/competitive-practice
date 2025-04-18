package org.hine.easy.stack;

import java.util.Stack;

public class MinLengthString {

    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            var current = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(current);
                continue;
            }

            if (current == 'B' && stack.peek() == 'A') stack.pop();
            else if (current == 'D' && stack.peek() == 'C') stack.pop();
            else stack.push(current);
        }
        return stack.size();
    }
}
