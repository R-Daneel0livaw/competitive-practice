package org.hine.easy.stack;

public class ClearDigits {

    public String clearDigits(String s) {
        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (!sb.isEmpty()) {
                    sb.setLength(sb.length() - 1);
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
