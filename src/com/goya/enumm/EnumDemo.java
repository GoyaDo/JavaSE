package com.goya.enumm;

/**
 * @author goya
 * @create 2021-05-11 21:07
 */
public class EnumDemo {
    public static void main(String[] args) {
        Clothes[] clothes = Clothes.values();
        Enum e = Clothes.MIDDLE;
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}

enum Clothes{
    SMALL,MIDDLE,BIG
}
