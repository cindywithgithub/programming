/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */

/**
 * @program: test
 * @description: 将 m 个苹果分在 n 个盘子里
 * @author: sunjiahui
 * @create: 2019-08-27 17:09
 **/


public class Apple {
    public static void main(String[] args) {
        int appleNum = 3;
        int plateNum = 3;
        System.out.println(devide(appleNum, plateNum));

    }

    public static int devide(int apple, int plate) {
        if (apple == 0 || plate == 1) {
            return 1;
        }
        if (apple < plate) {
            return devide(apple, apple);
        } else {
            return devide(apple, plate - 1) + devide(apple - plate, plate);
        }
    }

}
