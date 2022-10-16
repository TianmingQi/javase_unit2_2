package cn.tedu.vip.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    /**
     * java.net.ServerSocket
     * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟侥讹拷锟斤拷
     * 1.锟斤拷锟斤拷锟斤拷锟剿匡拷
     * 2.锟杰癸拷锟斤拷锟斤拷锟酵伙拷锟剿凤拷锟酵癸拷锟斤拷锟斤拷锟斤拷息
     */
    private ServerSocket server;

    public Server() {
        try {
            /*
            实锟斤拷锟斤拷ServerSocket锟斤拷锟斤拷
            锟斤拷锟斤拷锟较低筹拷锟斤拷锟剿匡拷
            锟斤拷锟斤拷锟斤拷锟剿口憋拷占锟矫会发锟斤拷锟届常
             */
            System.out.println("服务器正在启动");
            server = new ServerSocket(8080);
            System.out.println("服务器启动完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        /*
        Socket accept()
        锟矫凤拷锟斤拷锟斤拷一锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷,锟斤拷锟矫猴拷,锟斤拷锟斤拷锟斤拷停锟饺达拷锟酵伙拷锟剿碉拷锟斤拷息锟斤拷锟酵癸拷锟斤拷
        没锟斤拷锟斤拷息锟斤拷锟斤拷锟斤拷一直锟斤拷
         */
        try {
            System.out.println("等待客户端连接");
            Socket socket = server.accept();
            System.out.println("一个客户端连接了");
            /*
            锟斤拷socket锟叫伙拷锟斤拷锟斤拷锟斤拷锟�
            InputStream getInputStream()
             */
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String msg = br.readLine();
            System.out.println("msg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
