package com.sakura.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sakura
 */
public class Practise {
    public static void main(String[] args) {
        //acbbfcfeaaaa
        System.out.println(getFirstChar("abccdddd"));
    }

    static String getFirstChar(String s) {
        char[] chars = s.toCharArray();
        Set<String> fi = new HashSet<>();
        List<String> fList = new ArrayList<>();
        Set<String> more = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (fi.add(String.valueOf(chars[i]))) {
                fList.add(String.valueOf(chars[i]));
            } else {
                more.add(String.valueOf(chars[i]));
            }
        }
        if (fi.size() == more.size()) {
            return " ";
        }
        for (String s1 : fList) {
            if (more.add(s1)) {
                return s1;
            }
        }
        return "error";
    }


    public Integer add(Integer one, Integer two) {
        return one + two;
    }

}


