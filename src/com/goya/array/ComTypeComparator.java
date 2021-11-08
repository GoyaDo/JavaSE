package com.goya.array;

import java.util.Comparator;

/**
 * @author goya
 * @create 2021-04-14 22:47
 */
public class ComTypeComparator implements Comparator<ComType> {
    @Override
    public int compare(ComType o1, ComType o2) {
        return (o1.j < o2.j ? - 1 : (o1.j == o2.j ? 0 : 1));
    }

    @Override
    public Comparator<ComType> reversed() {
        return null;
    }
}
