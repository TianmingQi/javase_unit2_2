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
     * �����������������Ķ���
     * 1.�������˿�
     * 2.�ܹ������ͻ��˷��͹�������Ϣ
     */
    private ServerSocket server;

    public Server() {
        try {
            /*
            ʵ����ServerSocket����
            �����ϵͳ����˿�
            �������˿ڱ�ռ�ûᷢ���쳣
             */
            System.out.println("��������������");
            server = new ServerSocket(8080);
            System.out.println("�������������");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        /*
        Socket accept()
        �÷�����һ����������,���ú�,������ͣ�ȴ��ͻ��˵���Ϣ���͹���
        û����Ϣ������һֱ��
         */
        try {
            System.out.println("�ȴ��ͻ�������");
            Socket socket = server.accept();
            System.out.println("һ���ͻ���������");
            /*
            ��socket�л��������
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
