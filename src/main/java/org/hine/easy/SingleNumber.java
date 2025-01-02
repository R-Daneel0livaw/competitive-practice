package org.hine.easy;

public class SingleNumber {

    public int singeNumber(int[] arr) {
        var a = 0;
        for (var i : arr) {
            a ^= i;
        }
        return a;
    }
}
