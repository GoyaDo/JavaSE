package com.goya.array;

import java.util.Arrays;
import java.util.Random;
import java.util.jar.JarEntry;

/**
 * @author goya
 * @create 2021-04-14 22:20
 */
public class ComType implements Comparable<ComType>{
    int i,j;
    @Override
    public int compareTo(ComType o) {
        return (i < o.i ? -1 : (i == o.i ? 0 : 1));
    }

    public static void main(String[] args) {
        ComType comType = new ComType();
        comType.i = 1;
        comType.compareTo(comType);
        System.out.println(comType);
    }
}
