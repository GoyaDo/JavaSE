package com.goya.exception;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author goya
 * @create 2021-04-17 19:55
 */
public class LoggerDemo {
    public static void main(String[] args) {
//        Logger.getGlobal().info("logger test");
        Logger logger = Logger.getLogger("com.goya.exception.LoggerDemo");
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                //save information in log file
            }
        });

    }
}
