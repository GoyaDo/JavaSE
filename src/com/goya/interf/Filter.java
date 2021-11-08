package com.goya.interf;

/**
 * @author goya
 * @create 2021-04-23 23:31
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){ return input; }
}
