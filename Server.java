package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        Scanner scanner = new Scanner(inputStream,"UTF-8");
        OutputStream outputStream = socket.getOutputStream();

    }
}
