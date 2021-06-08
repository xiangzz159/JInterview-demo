package com.xiang.leetcode.algorithm;

public class QuickSort {
    public static void sort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int left = l;
        int right = r;
        // 待排序的第一个元素作为基准值
        int num = nums[l];
        // 从左右两边交替扫描，直到left == right
        while (left < right) {
            while (right > left && nums[right] >= num) {
                // 从右往左边扫描，找到第一个比基准值小的元素
                right--;
            }
            // 找到这种元素将arr[right]放入arr[left]中
            nums[left] = nums[right];

            while (left < right && nums[left] <= num) {
                // 从左往右扫描，找到第一个比基准值大的元素
                left++;
            }
            // 找到这种元素将arr[left]放入arr[right]中
            nums[right] = nums[left];
        }
        // 基准值归位
        nums[left] = num;
        // 对基准值左边的元素进行递归排序
        sort(nums, l, left - 1);
        // 对基准值右边的元素进行递归排序。
        sort(nums, right + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
