package com.goya.interf;

/**
 * @author goya
 * @create 2021-04-23 22:57
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }
}
//    public static void process(Processor p, Object s){
//        System.out.println("Using Processor"+p.name());
//        System.out.println(p.process(s));
//    }
//    public static String s = "Disagereement with beliefs is by definition incorrect";

//    public static void main(String[] args) {
//        process(new Upcase(),s);
//        process(new Downcase(),s);
//        process(new Splitter(),s);
//    }
//}
//
// class Processor{
//    public String name(){
//        return getClass().getSimpleName();
//    }
//    Object process(Object input){
//        return input;
//    }
//}
//
//class Upcase extends Processor{
//    String process(Object input){
//        return ((String)input).toUpperCase();
//    }
//}
//class Downcase extends Processor{
//    String process(Object input){
//        return ((String)input).toLowerCase();
//    }
//}
//class Splitter extends Processor{
//    String process(Object input){
//        return Arrays.toString(((String)input).split(" "));
//    }
//}

