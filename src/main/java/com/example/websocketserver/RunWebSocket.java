package com.example.websocketserver;
import java.net.ServerSocket;
import java.net.Socket;


public class RunWebSocket {
    public ServerSocket server;

    public RunWebSocket() {
        try {
            server = new ServerSocket(55555);

            System.out.print(server.getLocalPort());
            while (true) {
                try {
                    Socket socket = server.accept();
                    SocketHandler socketHandler = new SocketHandler(socket);
                    socketHandler.start();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}