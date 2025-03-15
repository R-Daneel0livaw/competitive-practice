package org.hine.easy.stack;

import java.util.Stack;

public class CrawlerLogFolder {

    public int crawlerLogFolder(String[] ops) {
        Stack<String> stack = new Stack<>();
        for (var op : ops) {
            if(op.equalsIgnoreCase("../")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (op.equalsIgnoreCase("./")) {
                // no-op; same folder
            } else {
                stack.push(op);
            }
        }
        return stack.size();
    }
}