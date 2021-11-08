package com.goya.operator;

import java.util.Date;

/**
 * @author goya
 * @create 2021-04-02 17:54
 */
public class operator {
    public volatile int a =1;
    private static Date date;
    public static void main(String[] args) {

//        int a = 4;
//        int b = 4;
        System.out.println(date);

//        System.out.println(a ^= b ); // 127

//        int c = a ^ b;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println(Integer.toBinaryString(c)); //3
//
//        int d = 4;
//        int e = 5;
//        int f = d ^ e;
//        System.out.println(Integer.toBinaryString(f));  //1
//
//        System.out.println(Integer.toBinaryString(a ^ d)); //101  5










//        short a = 1;
//        System.out.println(a++);
//        short b = ++a;
//        System.out.println(b);




//        int a = 10 /4;
//        System.out.println(10/0);
//        System.out.println(14.4/0);

//        int a = 6;
//        int b = 4;
//        int c = a + b;// c = 10
//        int d = a - b;// d = 2
//        int e = a * b;// e = 24
//        int f = a / b;// f = 1
//        int g = a % b;// g = 2
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        int a = 1;
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);
//        int a = 1;
//        int b = 2;
//        System.out.println(a == b); // false
//        System.out.println(a != b); // true
//        System.out.println(a > b); // false
//        System.out.println(a < b); // true
//        System.out.println(a <= b); // true
//        System.out.println(a >= b); // false
//        int a = 3;
//        int b = 2;
//        int c = 1;
//        if (a > b && c > b){
//            System.out.println(a);
//        }
//        if (a > c || c > b){
//            System.out.println(c);
//        }
//        if (!(a>b)){
//            System.out.println(b);
//        }
//        int a a= 0xaf;
//        int b = 071;
//        long c = 1L;
//        float f = 1.3f;
//        double d = 1.3d;
//        System.out.println(a); // 175
//        System.out.println(Integer.toBinaryString(a)); // 10101111
//        System.out.println(b); // 57
//        System.out.println(Integer.toBinaryString(b)); // 111001
//        System.out.println(c); // 1
//        System.out.println(Long.toBinaryString(c)); // 1
//        System.out.println(f); // 1.3
//        System.out.println(Float.toHexString(f)); // 0x1.4cccccp0
//        System.out.println(d); // 1.3
//        System.out.println(Double.toHexString(d)); // 0x1.4cccccccccccdp0
//        int a = 4;
//        int b =123;
//        System.out.println(a &= b); // 0
//        System.out.println(a); // 0
//        System.out.println(a |= b); // 123
//        System.out.println(a); // 123
//        System.out.println(a ^= b ); // 0
//        System.out.println(a); // 0
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a & b); // false
//        System.out.println(a | b); // true
//        System.out.println(a ^ b); // true
//        System.out.println("-----");
//        System.out.println(a &= b); // false
//        System.out.println(a |= b); // false
//        System.out.println( a ^= b); // false
//        int a = 1;
//        int b = a << 1;
//        System.out.println(b); //2
//        System.out.println(Integer.toBinaryString(b)); // 10
//        b = a << 2;
//        System.out.println(b); //4
//        System.out.println(Integer.toBinaryString(b)); // 100
//        b = a << 3;
//        System.out.println(b); //8
//        System.out.println(Integer.toBinaryString(b)); // 1000
//        int a = -1;
//        int b = a << 1;
//        System.out.println(b); //-2
//        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111110
//        b = a << 2;
//        System.out.println(b); //-4
//        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111100
//        b = a << 3;
//        System.out.println(b); //-8
//        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111000
//        int a = 8;
//        int b = a >> 1;
//        System.out.println(b); // 4
//        System.out.println(Integer.toBinaryString(b)); // 100
//        b = a >> 2;
//        System.out.println(b); //2
//        System.out.println(Integer.toBinaryString(b)); // 10
//        b = a >> 3;
//        System.out.println(b); //1
//        System.out.println(Integer.toBinaryString(b)); // 1
//        int c = -8;
//        int d = c >> 1;
//        System.out.println(d); // -4
//        System.out.println(Integer.toBinaryString(d)); // 11111111111111111111111111111100
//        d = c >> 2;
//        System.out.println(d); // -2
//        System.out.println(Integer.toBinaryString(d)); // 11111111111111111111111111111110
//        d = c >> 3;
//        System.out.println(d); // -1
//        System.out.println(Integer.toBinaryString(d)); // 11111111111111111111111111111111
//        int a = 8;
//        int b = a >>> 1;
//        System.out.println(b); // 4
//        System.out.println(Integer.toBinaryString(b)); // 100
//        b = a >>> 2;
//        System.out.println(b); //2
//        System.out.println(Integer.toBinaryString(b)); // 10
//        b = a >>> 3;
//        System.out.println(b); //1
//        System.out.println(Integer.toBinaryString(b)); // 1
//        int a = -8;
//        int b = a >>> 1;
//        System.out.println(b); // 2147483644
//        System.out.println(Integer.toBinaryString(b)); // 1111111111111111111111111111100
//        b = a >>> 2;
//        System.out.println(b); // 1073741822
//        System.out.println(Integer.toBinaryString(b)); // 111111111111111111111111111110
//        b = a >>> 3;
//        System.out.println(b); // 536870911
//        System.out.println(Integer.toBinaryString(b)); // 11111111111111111111111111111
//        int a = 1;
//        int b = 8;
//        System.out.println(a <<= 1); // 2
//        System.out.println(Integer.toBinaryString(a)); // 10
//        System.out.println(a >>= 1); // 1
//        System.out.println(Integer.toBinaryString(a)); // 1
//        System.out.println(b >>>= 1); // 4
//        System.out.println(Integer.toBinaryString(b)); // 100
//        System.out.println(b >>>=1); // 2
//        System.out.println(Integer.toBinaryString(b)); // 10

//        byte c = 1;
//        c >>>=128;
//        System.out.println(c);
//        char c = 'c';
//        System.out.println(Integer.toBinaryString(c));
//        System.out.println(c <<= 1);
//        System.out.println(Integer.toBinaryString(c));
//        int a = 8;
//        int b = a == 1 ? a << 1 : a >>> 1;
//        int c = a == 1 ? a >>>=1 : a >> 1;
//        System.out.println(a); // 8
//        System.out.println(b); // 4
//        System.out.println(c); // 4
//        byte b = 127;
//        short s = 32767;
//        short s2 = 100;
//        System.out.println(s+=1); // -32768
//        System.out.println(b+=1); // -128
//        byte b1 = b+=1;
//        System.out.println(b1); // -127
//        byte b2 = 150+100; // 编译错误

    }
}
