package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8080);

        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream,"UTF-8");

        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.printf("你好，我是中国人\r\n");
        printWriter.flush();

        String message = scanner.nextLine();
        System.out.println(message);

        socket.close();


    }


}
