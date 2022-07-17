package com.example;

import com.example.httpserver.RunHttpServer;
import com.example.websocketserver.RunWebSocket;

public class App {

    public static void main(String[] args) {
        RunHttpServer httpServer = new RunHttpServer();
        httpServer.start();
        RunWebSocket webSocket = new RunWebSocket();
    }
}
