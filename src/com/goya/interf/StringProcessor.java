package com.goya.interf;

import java.util.Arrays;

/**
 * @author goya
 * @create 2021-04-23 23:15
 */
public abstract class StringProcessor implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input) ;

    public static String s = "Disagereement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Splitter(),s);
        Apply.process(new Downcase(),s);
    }
}
class Upcase extends StringProcessor{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor{
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}


