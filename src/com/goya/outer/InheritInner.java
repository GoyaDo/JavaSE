package com.goya.outer;

/**
 * @author goya
 * @create 2021-04-27 21:43
 */
public class InheritInner extends WithInner.Inner{
    //! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super(); //必须,如果不指定则编译报错
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}


class WithInner{
    class Inner{

    }
}