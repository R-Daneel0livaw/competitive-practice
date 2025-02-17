package org.hine.easy;

public class FibonacciNumber {

    public int fibNum(int n) {
        if (n <= 1) return 1;

        var current = 0;
        var prev1 = 1;
        var prev2 = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
