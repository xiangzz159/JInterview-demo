package com.xiang.leetcode.leetcode;

public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            int a0 = (columnNumber - 1) % 26 + 1;
            sb.append((char)(a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Solution168 solution168 = new Solution168();
        System.out.println(solution168.convertToTitle(52));
    }
}
