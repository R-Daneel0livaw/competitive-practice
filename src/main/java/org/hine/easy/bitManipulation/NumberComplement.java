package org.hine.easy.bitManipulation;

public class NumberComplement {

    public int numberComplement(int n) {
        return (Integer.highestOneBit(n) << 1) - n - 1;
    }
}
