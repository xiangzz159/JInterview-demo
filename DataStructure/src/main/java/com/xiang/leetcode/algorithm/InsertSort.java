package com.xiang.leetcode.algorithm;

public class InsertSort {
    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            // 缓存i处的元素值
            int tmp = data[i];
            if (data[i] < data[i - 1]) {
                int j = i - 1;
                // 整体后移一格
                while (j >= 0 && data[j] > tmp) {
                    data[j + 1] = data[j];
                    j--;
                }
                // 最后将tmp插入合适的位置
                data[j + 1] = tmp;
            }
        }
    }

}
