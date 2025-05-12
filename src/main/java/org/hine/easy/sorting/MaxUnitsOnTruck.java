package org.hine.easy.sorting;

import java.util.Arrays;

public class MaxUnitsOnTruck {

    public int maxUnitsOnTruck(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        var unitCount = 0;
        for (var boxType: boxTypes) {
            var boxCount = Math.min(truckSize, boxType[0]);
            unitCount += boxCount * boxType[1];
            truckSize -= boxCount;
            if (truckSize == 0) break;
        }
        return unitCount;
    }
}
