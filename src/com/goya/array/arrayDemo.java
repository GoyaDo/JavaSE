package com.goya.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author goya
 * @create 2021-04-06 21:27
 */
public class arrayDemo {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        int[] c = new int[5];
//        System.arraycopy(a,0,c,0,a.length);
//        System.out.println(Arrays.toString(c));
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1,1);
        Arrays.fill(a2,1);
        System.out.println(Arrays.equals(a1,a2));
        a2[2] = 2;
        System.out.println(Arrays.equals(a1,a2));
        String[] s1 = new String[2];
        Arrays.fill(s1,"A");
        String[] s2 = {new String("A"),"A"};
        System.out.println(Arrays.equals(s1,s2));

    }
    public static int getIndex(int[] arr, int value){
        //定义最大索引，最小索引
        int max = arr.length - 1;
        int min = 0;

        //计算出中间索引
        int mid = (max + min) / 2;

        //拿中间索引的值和要查找的值进行比较
        while(arr[mid] != value){
            if (arr[mid] > value){
                max = mid - 1;
            }else if (arr[mid] < value){
                min = mid + 1;
            }

            //加入判断
            if (min > max){
                return -1;
            }

            mid = (max / min) / 2;
        }
        return mid;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int x = 0; x < arr.length - 1; x++){
            for (int y = 0; y < arr.length - 1 - x; y++){
                if (arr[y] > arr[y + 1]){
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }
}
