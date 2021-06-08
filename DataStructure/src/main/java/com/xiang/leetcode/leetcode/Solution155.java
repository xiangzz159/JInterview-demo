package com.xiang.leetcode.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution155 {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public void MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.add(Integer.MAX_VALUE);

    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
