package com.goya.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author goya
 * @create 2021-05-06 23:53
 */
public class IODemo {
    public static void main(String[] args) {
        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        InputStream inputStream1 = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }
}
