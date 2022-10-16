package cn.tedu.vip.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    private Socket socket;

    public Client() {
        try {
            /*
            ʵ����Socket��Ҫ��������
            1.��������IP��ַ
            2.��������,�˿ں�

            ֻҪʵ�����ɹ��������ӳɹ�
            ���ʧ�ܾͻ�����쳣

            �˿ں��Ǽ�����ṩ����Ľӿڵı���
            ip��ַ�Ǽ�����������е�����λ��
             */
            System.out.println("��ʼ����");
            socket = new Socket("localhost", 8080);
            System.out.println("���ӳɹ�");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        win+R����cmd
        �ڵ����Ľ���������ipconfig�۲챾����ip��ַ
         */
    }

    public void start() {
        /*
        Ҫ�뷢����Ϣ,��Ҫ��socket�����л�������
        OutputStream getOutStream;
         */
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            pw.println("���!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*
         * java.net.Socket
         * Socket��װ��TCPͨ��ϸ��,����ֻ��Ҫ��ȷIP��ַ�Ͷ˿ں�
         * ��������˷��������(������)����
         */
        Client client = new Client();
        client.start();
    }
}
