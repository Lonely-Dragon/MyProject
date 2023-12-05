package com.sakura.code;

import java.util.Scanner;

/**
 * @author sakura
 * 用户调度问题
 * 3
 * 15 8 17
 * 12 20 9
 * 11 7 5
 */
public class Main2 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int[][] data = new int[a][3];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 3; j++) {
                    int b = in.nextInt();
                    data[i][j] = b;
                }
            }
            //m 上一个已用策略
            int m = -1;
            int sum = 0;
            int preIndex;
            int[] index = minTwo(data[0]);
            sum += data[0][index[0]];
            preIndex = index[0];
            for (int i = 1; i < a; i++) {
                index = minTwo(data[i]);
                if (preIndex == index[0]) {
                    sum += data[i][index[1]];
                    preIndex = index[1];
                } else {
                    sum += data[i][index[0]];
                    preIndex = index[0];
                }
            }
            System.out.println(sum);
        }
    }

    /**
     * 最小放前面，第二小放第二位
     */
    static int[] minTwo(int[] arr) {
        int min1 = 0, min2 = 0;
        int num1, num2;
        if (arr[0] < arr[1]) {
            min1 = 0;
            num1 = arr[0];
            min2 = 1;
            num2 = arr[1];
        } else {
            min1 = 1;
            num1 = arr[1];
            min2 = 0;
            num2 = arr[0];
        }

        int[] res = new int[2];
        if (arr.length <= 2) {
            if (arr[0] < arr[1]) {
                res[0] = 0;
                res[1] = 1;
            } else {
                res[0] = 1;
                res[1] = 0;
            }
            return res;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < num1) {
                num2 = num1;
                min2 = min1;
                min1 = i;
                num1 = arr[i];
                continue;
            } else if (arr[i] <= num2) {
                min2 = i;
                num2 = arr[i];
            }
        }
        res[0] = min1;
        res[1] = min2;
        return res;
    }

}

