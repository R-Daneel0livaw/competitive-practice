package org.hine.easy.stack;

import java.util.Stack;

public class ReversePrefix {

    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        var index = 0;
        while (index < word.length()) {
            stack.push(word.charAt(index));
            if (word.charAt(index) == ch) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                index++;
                while (index < word.length()) {
                    sb.append(word.charAt(index));
                    index++;
                }
                return sb.toString();
            }
            index++;
        }
        return word;
    }
}
