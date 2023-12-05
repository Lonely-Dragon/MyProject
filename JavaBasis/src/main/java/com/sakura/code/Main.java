package com.sakura.code;

import java.util.*;

/**
 * @author sakura
 * 回文素数
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int param = 0;
        param = in.nextInt();
        List<Integer> finalAnswer = problem1(param);
        if(param<=1){System.out.println(0);return;}
        if (finalAnswer.get(0) == 0) {
            System.out.println(0);
            return;
        }
        System.out.print(finalAnswer.size() + ",");
        for (int i = 0; i < finalAnswer.size(); i++) {
            if (i == finalAnswer.size() - 1) {
                System.out.print(finalAnswer.get(i));
                break;
            }
            System.out.print(finalAnswer.get(i) + ",");
        }

    }

    static List<Integer> problem1(int param) {
        List<Integer> result = new ArrayList<>();
        if (param <= 1) {
            result.add(0);
            return result;
        }
        if (param == 2) {
            result.add(2);
            return result;
        }
        List<Integer> su = new ArrayList<>();
        su.add(2);
        for (int i = 3; i <= param; i++) {
            if (isSu(i)) {
                su.add(i);
            }
        }
        for (Integer integer : su) {
            if (isHw(integer)) {
                result.add(integer);
            }
        }
        return result;

    }

    static Boolean isHw(int n) {
        if (n < 10) {
            return true;
        }
        String num = String.valueOf(n);
        char[] numChars = num.toCharArray();
        for (int i = 0; i < numChars.length ; i++) {
            char charOne = numChars[i];
            char charTwo = numChars[numChars.length - 1 - i];
            if (charOne != charTwo) {
                return false;
            }
        }
        return true;
    }

    static Boolean isSu(int n) {
        int mid = n / 2 + 1;
        for (int i = 2; i < mid; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}