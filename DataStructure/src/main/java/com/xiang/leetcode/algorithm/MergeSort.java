package com.xiang.leetcode.algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int left, int right) {
        if  (left >= right) {
            return;
        }
        int center = (left + right) / 2;
        sort(data, left, center);
        sort(data, center + 1, right);

        merge(data, left, center, right);

    }

    public static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        int third = left;
        int tmp = left;
        while (left <= center && mid <= right) {
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        mergeSort(data);
        System.out.println(Arrays.toString(data));
    }
}
