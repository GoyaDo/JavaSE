package com.goya.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author goya
 * @create 2021-04-06 22:16
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("11111");
        set.add("22222");
        set.add("33333");
        set.add("44444");
        set.add("22222");
        System.out.println(set.size());
        for (String e : set) {
            System.out.println(e);
        }

        Set<String> treeSet = new TreeSet<>();

    }
}
