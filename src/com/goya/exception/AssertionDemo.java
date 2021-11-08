package com.goya.exception;

import java.util.Scanner;

/**
 * @author goya
 * @create 2021-04-17 19:29
 */
public class AssertionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        System.out.println(classLoader.toString());
//        Class<? extends ClassLoader> aClass = classLoader.getClass();
//        ClassLoader classLoader1 = aClass.getClassLoader();
//        classLoader1.setDefaultAssertionStatus(true);
//        systemClassLoader.setDefaultAssertionStatus(true);
//        ClassLoader.getSystemClassLoader();
//        ClassLoader parent = classLoader.getParent();
//        ClassLoader parent1 = parent.getParent();
//        ClassLoader classLoader1 = Class.forName("com.goya.exception.AssertionDemo").getClassLoader();
//        classLoader1.setDefaultAssertionStatus(true);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        assert i >= 0;
        if (i % 3 == 0){
            System.out.println("0");
        }else if (i % 3 == 1){
            System.out.println("1");
        }else {
            assert i % 3 == 2;
            System.out.println("2");
        }
    }
}
