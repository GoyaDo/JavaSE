package com.goya.exception;

import java.io.ByteArrayOutputStream;

/**
 * @author goya
 * @create 2021-04-17 17:10
 */
public class StackTraceDemo {
    public static void main(String[] args) {
//        Throwable t = new Throwable();
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        t.printStackTrace(out);
//        String description = out.toString();
//        System.out.println(description);
//        int i = 10/0;
        try {
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("1");
    }
}
