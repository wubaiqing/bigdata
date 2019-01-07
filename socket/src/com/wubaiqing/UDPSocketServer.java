package com.wubaiqing;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UDPSocketServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);

        while (true) {
            Socket socket = server.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] bys = new byte[1024];
            int len = inputStream.read(bys);
            System.out.println(new String(bys, 0, len));
        }
    }
}
