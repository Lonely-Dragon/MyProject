package com.sakura.code;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            li[i] = x;
        }
        for (int number : li) {
            for (int ints : getList(number)) {
                System.out.print(ints + " ");
            }
            System.out.println();
        }
    }

    static int[] getList(int m) {
        if (m == 1) {
            int[] res = {1};
            return res;
        }
        int[] nums = new int[m];
        for (int num : nums) {
            num = 0;
        }
        int tmp = 0;
        int index = 0;
        for (int i = 1; i <= m; index++) {
            if (index == m) {
                index = 0;
            }
            if (tmp == 0) {
                if (nums[index] == 0) {
                    tmp = 1;
                    continue;
                }
            }
            if (tmp == 1) {
                if (nums[index] == 0) {
                    nums[index] = i;
                    i++;
                    tmp = 0;
                } else {
                    continue;
                }
            }
        }
        return nums;
    }

}
