package com.goya.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author goya
 * @create 2021-04-20 23:42
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Callable<String> callable = new SomeCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        thread1.suspend();
    }
}

class SomeCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count = i;
            System.out.println(count);
        }
        return String.valueOf(count);
    }
}