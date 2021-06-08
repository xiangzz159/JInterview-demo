package com.xiang.leetcode.leetcode;

import java.util.Arrays;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/4 14:20
 * @Desc：从尾部开始往前便利，是否依次增大
 */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int maxNum = nums[nums.length - 1];
        int idx = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (maxNum <= nums[i]) {
                maxNum = nums[i];
            } else {
                idx = i;
                break;
            }
        }
        if (idx == nums.length - 1) {
            for (int i = 0; i < nums.length / 2; i++) {
                if (nums[i] > nums[nums.length - 1 - i]) {
                    int n = nums[i];
                    nums[i] = nums[nums.length - 1 - i];
                    nums[nums.length - 1 - i] = n;
                } else {
                    break;
                }
            }
        } else {
            for (int i = nums.length - 1; i >= idx; i--) {
                if (nums[idx] < nums[i]) {
                    int n = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = n;
                    break;
                }
            }
            idx++;
            for (int i = idx; i < (nums.length + idx) / 2; i++) {
                if (nums[i] > nums[nums.length + idx  - 1- i]) {
                    int n = nums[i];
                    nums[i] = nums[nums.length + idx - i - 1];
                    nums[nums.length + idx - i - 1] = n;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 3, 5, 4, 1};
//        int[] nums = {6, 5, 4, 1};
//        int[] nums = {1, 2};
//        int[] nums = {1, 3, 2};
        Solution31 solution31 = new Solution31();
        solution31.nextPermutation(nums);
    }
}
