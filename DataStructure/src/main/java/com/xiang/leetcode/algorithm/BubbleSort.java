package com.xiang.leetcode.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        int num = data[i];
        data[i] = data[j];
        data[j] = num;
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            // 记录某趟是否发生交换，若为false表示数组已处于有序状态
            boolean isSorted = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                    isSorted = true;
                }
            }
            if (!isSorted) {
                // 若数组已处于有序状态，结束循环
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data5 = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        bubbleSort(data5);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(data5));
    }
}
