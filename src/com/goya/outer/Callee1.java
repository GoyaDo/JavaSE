package com.goya.outer;

/**
 * @author goya
 * @create 2021-04-27 21:21
 */
public class Callee1 implements Incrementable{

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement myIncrement) {myIncrement.increment();}
}
class Callee2 extends MyIncrement{
    private  int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}
























































































































































































































































































































































































































































class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){ callbackReference = cbh; }
    void go(){ callbackReference.increment();}
}
