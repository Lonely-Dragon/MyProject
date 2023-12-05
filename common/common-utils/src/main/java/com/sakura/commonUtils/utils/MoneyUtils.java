package com.sakura.commonUtils.utils;
import	java.util.ArrayList;
import	java.util.List;


import org.apache.commons.lang.math.NumberUtils;

public class MoneyUtils {
    
    public static void main(String[] args) throws Exception{
        String money = "25623452345.68";
        System.out.println(NumberUtils.isNumber(money));
        if(NumberUtils.isNumber(money)){
            int index = money.indexOf(".");
            StringBuffer sb = new StringBuffer();
            sb.append(money);
            for (int i = index-3; i >0; i-=3 ) {
                sb.insert(i,",");
            }
            System.out.println(sb.toString());
        }else {
            throw new Exception("参数不是数字类型");
        }
    }
}
