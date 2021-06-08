package com.xiang.leetcode.leetcode;

import java.util.*;

public class Solution494 {
    /**
     * [1] -> 1,-1 -> 2钟
     * [1,1] -> 2,-2,0 -> 4钟
     * 11=2
     * 1-1=0
     * -11=0
     * -1-1=-2
     * [1,1,1] -> 3,-3,1,
     * 111=3
     * 11-1=1
     * 1-11=1
     * 1-1-1=-1
     * -111=1
     * -11-1=-1
     * -1-1-1=-3
     * -1-11=-1
     */

    /**
     * 1 -1
     * 2 0 0 -2
     * 3 1 1 -1 1 -1 -1 -3
     */
//    public int findTargetSumWays(int[] nums, int target) {
//        int rows = nums.length;
//        int cols = 2 << (nums.length - 1);
//        int[][] dp = new int[rows][cols];
//        for (int i = 0; i < nums.length; i++) {
//            int limit = 2 << i;
//            for (int j = 0; j < limit; j++) {
//                int mult = (j % 2 == 0) ? 1 : -1;
//                if (i == 0) {
//                    dp[i][j] = nums[i] * mult;
//                } else {
//                    dp[i][j] = dp[i - 1][j / 2] + mult * nums[i];
//                }
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < 2 << (nums.length - 1); i++) {
//            if (dp[nums.length - 1][i] == target) {
//                count++;
//            }
//        }
//        return count;
//    }

//    public int findTargetSumWays(int[] nums, int target) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0) {
//                list.add(nums[0]);
//                list.add(-1 * nums[0]);
//            } else {
//                List<Integer> copy = new ArrayList<>();
//                for (Integer integer : list) {
//                    copy.add(integer + nums[i]);
//                    copy.add(integer - nums[i]);
//                }
//                list.clear();
//                list.addAll(copy);
//            }
//        }
//        int count = 0;
//        for (Integer integer : list) {
//            if (integer == target) {
//                count++;
//            }
//        }
//        return count;
//    }

    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    public void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }
    }

    public static void main(String[] args) {
        Solution494 solution494 = new Solution494();
        System.out.println(solution494.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
//        System.out.println(solution494.findTargetSumWays(new int[]{}, 0));
    }

   
}
