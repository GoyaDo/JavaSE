package com.goya.interf;

/**
 * @author goya
 * @create 2021-04-23 23:32
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){ return "Waveform" + id; }
}
