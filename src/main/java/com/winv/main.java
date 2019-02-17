package com.winv;

import com.leecode.TowSum;

public class main {
    public static void main(String[] args) {
        System.out.println("leet code");

        TowSum ts = new TowSum();
        int[] input = new int[]{2, 7, 9, 11};
        int[] result = ts.twoSum(input, 9);
        System.out.println(String.format("暴力解法:{0},{1}", result[0], result[1]));
    }
}
