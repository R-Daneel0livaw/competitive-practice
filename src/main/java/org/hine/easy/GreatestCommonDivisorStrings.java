package org.hine.easy;

public class GreatestCommonDivisorStrings {

    public String greatCommonDivisorStrings(String str1, String str2) {
        if (!(str1 + str2).equals((str2 + str1))) return "";

        var gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }
}
