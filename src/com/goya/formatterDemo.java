package com.goya;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author goya
 * @create 2021-04-12 22:14
 */
public class formatterDemo {
    private String name;
    private Formatter formatter;
    public formatterDemo(String name,Formatter formatter){
        this.name = name;
        this.formatter = formatter;
    }
    public void move(int x,int y){
        formatter.format("%s aaa is at(%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream out = System.out;
        formatterDemo f = new formatterDemo("aaa",new Formatter(System.out));
        formatterDemo ff = new formatterDemo("bbb",new Formatter(out));
        f.move(0,0);
        ff.move(4,8);
    }
}
