package com.goya.interf;

/**
 * @author goya
 * @create 2021-04-23 23:18
 */
public interface Processor {
    String name();
    Object process(Object input);
}
