import java.io.*;
import java.net.*;

public class TCPChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(input.readLine());

            String message;
            while ((message = userInput.readLine()) != null) {
                output.println(message);
            }
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}