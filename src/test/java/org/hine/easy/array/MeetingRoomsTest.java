package org.hine.easy.array;

import org.hine.easy.array.MeetingRooms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingRoomsTest {

    @Test
    void testMeetingRooms() {
        var intervals = new int[][] {{0, 30}, {5, 10}, {15, 20}};
        var expected = false;
        var actual = new MeetingRooms().meetingRooms(intervals);

        assertEquals(expected, actual);
    }
}
