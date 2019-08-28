/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */

/**
 * @program: test
 * @description: 计算从高度 h 掉落的小球反弹 n 次之后经历的总路程
 * @author: sunjiahui
 * @create: 2019-08-27 17:20
 **/


public class Ball {
    public static void main(String[] args) {
        System.out.println(getLength(10,2));

    }

    public static double getLength(int high, int n) {
        if (n == 1) {
            return high;
        } else
            return getLength(high, n - 1) + high / Math.pow(2, n - 2);
    }

}
