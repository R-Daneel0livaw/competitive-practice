package org.hine.easy.bitManipulation;

public class PowerOf2 {

    public boolean powerOfTwo(int n) {
        if (n == 0) return false;
        long x = n;
        return (x & (-x)) == x;
    }
}
