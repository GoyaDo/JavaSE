package com.goya.interf.factory;

/**
 * @author goya
 * @create 2021-04-26 21:24
 */
public class Implementation1 implements Service{
    public Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}
