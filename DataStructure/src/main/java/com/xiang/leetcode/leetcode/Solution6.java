package com.xiang.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Object[] objects = new Object[numRows];
        int i = 0;
        int index = 0;
        int addNum = 1;
        while (i < s.length()) {
            if (objects[index] == null) {
                objects[index] = new ArrayList<>();
            }
            List list = (ArrayList) objects[index];
            list.add(s.charAt(i));
            if (index == numRows - 1) {
                addNum = -1;
            } else if (index == 0) {
                addNum = 1;
            }
            index += addNum;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (Object object : objects) {
            if (null == object) {
                continue;
            }
            List list = (ArrayList) object;
            for (int i1 = 0; i1 < list.size(); i1++) {
                sb.append(list.get(i1).toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.convert("AB", 1));
        System.out.println("PINALSIGYAHRPI");
    }
}
