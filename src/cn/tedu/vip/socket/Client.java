package cn.tedu.vip.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    private Socket socket;

    public Client() {
        try {
            /*
            实例化Socket需要两个参数
            1.服务器端IP地址
            2.服务器端,端口号

            只要实例化成功就是连接成功
            如果失败就会出现异常

            端口号是计算机提供服务的接口的编码
            ip地址是计算机在网络中的所在位置
             */
            System.out.println("开始连接");
            socket = new Socket("localhost", 8001);
            System.out.println("连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        win+R搜索cmd
        在弹出的界面中输入ipconfig观察本机的ip地址
         */
    }

    public void start(){
        /*
        要想发出信息,需要从socket对象中获得输出流
        OutputStream getOutStream;
         */
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw=  new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            pw.write("你好!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*
         * java.net.Socket
         * Socket封装了TCP通信细节,我们只需要明确IP地址和端口号
         * 向服务器端发送输出流(输入流)即可
         */
        Client client = new Client();
        client.start();
    }
}
