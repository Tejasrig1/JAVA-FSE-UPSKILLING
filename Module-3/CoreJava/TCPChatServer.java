import java.io.*;
import java.net.*;

public class TCPChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is waiting for clients...");
            Socket socket = serverSocket.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("Connected to chat server!");
            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
            }
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}