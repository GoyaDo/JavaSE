package com.goya.interf.factory;

/**
 * @author goya
 * @create 2021-04-26 21:25
 */
public class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
