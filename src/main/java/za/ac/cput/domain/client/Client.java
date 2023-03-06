package za.ac.cput.domain.client;

import java.net.Socket;

public class Client {
    private Socket socket;
    private int port;

    public void connectionToServer() throws Exception{
        socket = new Socket("localhost",port);
        System.out.println("connection established in port: "+port);
    }

    public static void main(String[] args) throws Exception{
        Client client = new Client();
        client.connectionToServer();
    }

}
