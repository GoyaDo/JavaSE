package com.goya.control;

import javax.swing.text.AbstractDocument;
import java.util.Random;

/**
 * @author goya
 * @create 2021-04-03 10:19
 */
public class control {
    public static void main(String[] args) {
//        boolean flag = false;
//        if (flag){
//            System.out.println("false");
//        }else{
//            System.out.println("true"); // true
//        }
//        double d;
//        while((d = Math.random()) < 0.99){
//            System.out.println(d);
//        }
//        double d;
//        do {
//            d = Math.random();
//            System.out.println(d);
//        }while(d < 0.99);
//        for (int i = 0; i <= 9; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print(i+"*"+j+"="+i*j+" ");
//            }
//            System.out.println();
//        }
    /*
    0*0=0
    1*0=0 1*1=1
    2*0=0 2*1=2 2*2=4
    3*0=0 3*1=3 3*2=6 3*3=9
    4*0=0 4*1=4 4*2=8 4*3=12 4*4=16
    5*0=0 5*1=5 5*2=10 5*3=15 5*4=20 5*5=25
    6*0=0 6*1=6 6*2=12 6*3=18 6*4=24 6*5=30 6*6=36
    7*0=0 7*1=7 7*2=14 7*3=21 7*4=28 7*5=35 7*6=42 7*7=49
    8*0=0 8*1=8 8*2=16 8*3=24 8*4=32 8*5=40 8*6=48 8*7=56 8*8=64
    9*0=0 9*1=9 9*2=18 9*3=27 9*4=36 9*5=45 9*6=54 9*7=63 9*8=72 9*9=81
     */
//        Random random = new Random(47);
//        float f[] = new float[10];
//        for (int i = 0; i < 10; i++){
//            f[i] = random.nextFloat();
//        }
//        for (float x : f){
//            System.out.println(x);
//        }
//        for (int i = 0; i < 20; i++) {
//            if (i == 15) {
//                break;
//            }
//            if (i % 3 != 0){
//                continue;
//            }
//            System.out.println(i); // 0 3 6 9 12
//        }
//        System.out.println("---------");
//        Random random = new Random(47);
//        int i[] = new int[20];
//        for (int j = 0; j < i.length; j++) {
//            i[j] = (int) Math.round(Math.random()*20);
//        }
//        for (int x : i) {
//            if (x == 15) break;
//            if (x % 3 != 0) continue;
//            System.out.println(x); // 9 18 (random)
//        }
//        System.out.println("---------");
//        int j = 0;
//        while (true){
//            j++;
//            int k = j * 1;
//            if (k == 20) break;
//            if (j % 3 != 0) continue;
//            System.out.println(j); // 3 6 9 12 15 18
//        }
        System.out.println("value="+switchit(4));

    }
    public static int switchit(int x){
        int j = 1;
        switch (x){
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            default: j++;
        }
        return j+x;
    }
}
