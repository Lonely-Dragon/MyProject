package com.sakura.commonUtils.utils;

import java.math.BigDecimal;

public class BigdecimalUtil {

    public static void main(String[] args) {
        String s = "1239871284728793712";
        BigDecimal decimal = new BigDecimal(Double.valueOf("0"));
        System.out.println(decimal.toString());
        BigDecimal decimal2 = new BigDecimal(Double.valueOf(s));
        System.out.println(decimal2.toString());
        decimal= decimal.add(new BigDecimal(decimal2.doubleValue()));
        System.out.println(decimal.toString());
    }
}
