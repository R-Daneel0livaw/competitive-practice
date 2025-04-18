package org.hine.easy.stack;

public class MakeStringGreat {

    public String makeGreat(String s) {
        var sb = new StringBuilder(s);
        var end = 0;

        for (int i = 0; i < s.length(); i++) {
            if (end > 0 && Math.abs(sb.charAt(i) - sb.charAt(end - 1)) == 32) {
                end--;
            } else {
                sb.setCharAt(end, s.charAt(i));
                end++;
            }
        }
        return sb.substring(0, end);
    }
}
