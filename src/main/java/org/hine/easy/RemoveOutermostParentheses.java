package org.hine.easy;

public class RemoveOutermostParentheses {

    public String removeOutermostParentheses(String s) {
        var sb = new StringBuilder();
        var opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0) {
                sb.append(c);
            } else if (c == ')' && opened-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}