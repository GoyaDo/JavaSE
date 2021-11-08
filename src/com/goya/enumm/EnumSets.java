package com.goya.enumm;


import java.util.EnumSet;
import static com.goya.enumm.AlarmPoints.*;

/**
 * @author goya
 * @create 2021-05-11 21:50
 */
public class EnumSets{
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);

        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);

        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);

        points.removeAll(EnumSet.of(OFFICE1, OFFICE2));
        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
/*
[BATHROOM]
[STAIR1, STAIR2, BATHROOM, KITCHEN]
[LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UNILITY]
[LOBBY, OFFICE3, OFFICE4, BATHROOM, UNILITY]
[STAIR1, STAIR2, OFFICE1, OFFICE2, KITCHEN]
 */
