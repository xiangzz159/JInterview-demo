package com.xiang.leetcode.leetcode;

import com.xiang.leetcode.comm.ListNode;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        int countA = 1;
        ListNode b = headB;
        int countB = 1;

        while (a.next != null) {
            a = a.next;
            countA++;
        }
        while (b.next != null) {
            b = b.next;
            countB++;
        }
        if (countA >= countB) {
            return findSameNode(headA, headB, countA, countB);
        } else {
            return findSameNode(headB, headA, countB, countA);
        }
    }
    public ListNode findSameNode(ListNode longNode, ListNode shortNode, int l, int s) {
        while (l > 0) {
            if (l == s) {
                if (shortNode == longNode) {
                    return longNode;
                }
                shortNode = shortNode.next;
                s--;
            }
            longNode = longNode.next;
            l--;

        }
        return null;
    }
}
