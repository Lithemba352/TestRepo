package za.ac.cput.client;

import za.ac.cput.domain.JobSeeker;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    private int port;
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;

    public void connectionToServer() throws Exception{
        socket = new Socket("localhost",port);
        System.out.println("connection established in port: "+port);
    }

    public void streams() throws Exception{
        inputStream = new ObjectInputStream(socket.getInputStream());
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.flush();
    }

    public void sendMessageToServer(JobSeeker jobSeeker) throws Exception{
        outputStream.writeObject(jobSeeker);
    }



}
