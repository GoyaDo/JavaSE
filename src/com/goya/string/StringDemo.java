package com.goya.string;

import java.util.Date;

/**
 * @author goya
 * @create 2021-04-10 20:04
 */
public class StringDemo {
    public static void main(String[] args) {
//        String s = new String("aaa").intern();
//        String s1 = "aaa";
//        System.out.println(s == s1);
//        String str = null;
//        if(str !=null && str.length()!= 0){
//            System.out.println("null");
//        }
//        if(str.length()!= 0 && str !=null ){
//            System.out.println("null");
//        }
//        System.out.printf("%tc",new Date());
        System.out.printf("%1$s %2$tB %2$te,%2$tY","Due date:",new Date());
    }
}
