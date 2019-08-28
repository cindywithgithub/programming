/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */

/**
 * @program: test
 * @description: 求最大子序列之和
 * @author: sunjiahui
 * @create: 2019-08-27 16:57
 **/


public class MaxSubSum {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, -9, 0};
        System.out.print(getMaxSubSum(num));
    }

    private static int getMaxSubSum(int[] num) {
        int max = num[0];
        int sum = num[0];
        for (int i = 1; i < num.length; i++) {
            sum = Math.max(num[i], max + num[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
