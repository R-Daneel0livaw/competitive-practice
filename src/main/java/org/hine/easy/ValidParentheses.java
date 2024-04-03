package org.hine.easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private Map<Character, Character> mappings = Map.of(')', '(',
            '}', '{',
            ']', '[');
    public boolean validParentheses(String s) {
        var stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if(this.mappings.containsKey(c)) {
                var topElement = stack.isEmpty() ? "#" : stack.pop();
                if(topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}