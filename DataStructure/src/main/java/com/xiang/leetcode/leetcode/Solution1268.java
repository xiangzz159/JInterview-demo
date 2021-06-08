package com.xiang.leetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/4 16:20
 * @Desc：
 */
public class Solution1268 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < searchWord.length(); i++) {
            boolean flag = true;
            List<String> line = new ArrayList<>();
            String str = searchWord.substring(0, i + 1);
            for (int j = idx; j < products.length; j++) {
                if (products[j].startsWith(str)) {
                    idx = flag ? j : idx;
                    flag = false;
                    line.add(products[j]);
                    if (line.size() == 3) {
                        break;
                    }
                }
            }
            result.add(new ArrayList<>(line));
        }
        return result;
    }

    public static void main(String[] args) {
        String searchWord = "tes";
        String[] products = {"havana"};
        Solution1268 solution1268 = new Solution1268();
        System.out.println(solution1268.suggestedProducts(products, searchWord));
    }
}
