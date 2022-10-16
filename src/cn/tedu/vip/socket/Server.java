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
     * 服务器端运行这个类的对象
     * 1.申请服务端口
     * 2.能够监听客户端发送过来的信息
     */
    private ServerSocket server;

    public Server() {
        try {
            /*
            实例化ServerSocket对象
            箱操作系统申请端口
            如果这个端口被占用会发生异常
             */
            System.out.println("服务器正在启动");
            server = new ServerSocket(8001);
            System.out.println("服务器启动完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        /*
        Socket accept()
        该方法是一个阻塞方法,调用后,程序暂停等待客户端的信息发送过来
        没有信息过来就一直等
         */
        try {
            System.out.println("等待客户端连接");
            Socket socket = server.accept();
            System.out.println("一个客户端连接了");
            /*
            从socket中获得输入流
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
