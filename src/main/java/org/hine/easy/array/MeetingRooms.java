package org.hine.easy.array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public boolean meetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) return false;
        }
        return true;
    }
}
