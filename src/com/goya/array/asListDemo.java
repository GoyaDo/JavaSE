package com.goya.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author goya
 * @create 2021-04-14 23:19
 */
public class asListDemo {
    public static void main(String[] args) {
//        List<String> letter = new ArrayList<String>();
//        letter.add("a");
//        letter.add("b");
//        letter.add("c");
//
//        List<String> strings = letter.subList(0, 1);
//        System.out.println(strings);
//        strings.set(0,"d");
//        System.out.println(letter);
//        System.out.println(strings);

//        ArrayList subList = (ArrayList) letter.subList(0, 1);
//        System.out.println(subList);

        String[] letter = {"a","b","c"};
        List<String> strings = Arrays.asList(letter);
        strings.add("d");
        System.out.println(strings);

    }
}
