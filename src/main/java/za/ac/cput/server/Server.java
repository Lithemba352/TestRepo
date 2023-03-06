package za.ac.cput.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            server = new ServerSocket(1234);

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            System.exit(0);
        }

        while (true) {
            try {

                System.out.println("Sever running ...listening for a connection...");
                Socket s1 = server.accept();
                System.out.println("Connection established");

                ObjectInputStream input = new ObjectInputStream(s1.getInputStream());
                System.out.println("Sending data...");
                System.out.println(input.readObject());

                input.close();
                s1.close();
                System.out.println("");
            }
            catch (IOException e){
                System.out.println("Error: " +e.getMessage());
            }catch(Exception e){
                System.out.println(e);
            }




            }
        }
    }