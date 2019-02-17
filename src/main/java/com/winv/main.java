package com.winv;

import com.leecode.TowSum;

public class main {
    public static void main(String[] args) {
        System.out.println("leet code");

        TowSum ts = new TowSum();
        int[] input = new int[]{2, 7, 9, 11};
        int[] result = ts.twoSum(input, 11);
        System.out.println(String.format("暴力解法:%d,%d", result[0], result[1]));
        result = ts.twoSumHash(input, 11);
        System.out.println(String.format("hash遍历:%d,%d", result[0], result[1]));
        result = ts.twoSumHashOne(input, 11);
        System.out.println(String.format("一轮Hash遍历:%d,%d", result[0], result[1]));
    }
}
