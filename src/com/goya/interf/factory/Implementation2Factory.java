package com.goya.interf.factory;

/**
 * @author goya
 * @create 2021-04-26 21:27
 */
public class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
