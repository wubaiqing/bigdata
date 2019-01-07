package com.wubaiqing;

import java.io.OutputStream;
import java.net.Socket;

public class UDPSocketClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("Hello, this is tcp".getBytes());
        client.close();
    }
}
