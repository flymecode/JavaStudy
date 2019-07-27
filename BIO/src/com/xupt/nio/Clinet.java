package com.xupt.nio;

public class Clinet {
    public static void main(String[] args) {
        TimeClientHandler handler = new TimeClientHandler("localhost",8082);
        new Thread(handler).start();
    }
}
