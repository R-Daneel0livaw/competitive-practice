package org.hine.easy;

public class AddStrings {

    public String addStrings(String num1, String num2) {
        var sb = new StringBuilder();
        var carry = 0;
        var p1 = num1.length() - 1; var p2 = num2.length() - 1;
        while (p1 >= 0  || p2 >= 0) {
            var x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            var x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            var value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            sb.append(value);
            p1--;
            p2--;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
