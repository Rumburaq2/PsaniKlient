import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

       /// while(true) {
        for(int i=0; i< 1; i++){
            Socket sc = new Socket("192.168.82.7", 10000);
            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
           // out.println(scan.nextLine());
            out.println("HTTP/1.1 200 OK\nConnection: close");
            out.println("Connection: close");
            out.println("Content-Type: text/html; charset=UTF-8");
            out.println("");
        }

    }
}