package com.goya.util;

/**
 * 十六进制转换小工具
 * @author goya
 * @create 2021-04-12 22:20
 */
public class HexTool {
    public static String format(byte[] date){
        StringBuilder result = new StringBuilder();
        int n = 0;
        for(byte b : date){
            if(n % 16 == 0){
                result.append(String.format("%05X: ",n));
            }
            result.append(String.format("%02X ",b));
            n++;
            if (n % 16 == 0) result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }
}
