package com.xupt.nio;

public class Server {


    public static void main(String[] args) {
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(8082);
        new Thread(timeServer).start();
    }


}
