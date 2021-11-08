package com.goya.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goya
 * @create 2021-04-18 18:54
 */
public class ArrayListDemo {

    private static String b;
    public static final List<String> LIST = new ArrayList<>();

    public static void main(String[] args) {
        list(LIST.add("a"));
    }

    public static void list(boolean a) {


        b = LIST.set(0, "b");
        for (String s : LIST) {
            System.out.println(s);
        }
        System.out.println(LIST.toString());
//        if () {
//            LinkedList<Object> objects = new LinkedList<>();
//            list.remove();
//
//        }
    }
}
