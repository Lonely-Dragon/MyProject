package com.sakura.code;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int[][] data = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    int b = in.nextInt();
                    data[i][j] = b;
                }
            }
        }
    }
}
