package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class Logger {

    Map<String, Integer> msgDict = new HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!msgDict.containsKey(message)) {
            msgDict.put(message, timestamp);
            return true;
        }

        Integer oldTimestamp = this.msgDict.get(message);
        int differnce = timestamp - oldTimestamp;
        if(differnce >= 10) {
            this.msgDict.put(message, timestamp);
            return  true;
        }
        return false;
    }
}