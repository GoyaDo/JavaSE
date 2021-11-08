package com.goya.outer;

/**
 * @author goya
 * @create 2021-04-27 20:35
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
