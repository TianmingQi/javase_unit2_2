package cn.tedu.vip.io;

import java.io.*;
import java.util.Scanner;

/**
 * ���׼��±�
 * ����������,���û�������±����ļ���
 * �û�ѭ������±���������
 * ����exitʱѭ���˳�,�������
 *
 * @author Tedu
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������ļ���:");
        String fileName = scan.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        PrintWriter pw = new PrintWriter(bw);

        while (true) {
            System.out.println("�����");
            String msg = scan.nextLine();
            if ("exit".equals(msg)) {//equals()����һ��Ѿ�������������,��ֹ��ָ���쳣
                break;
            }
            pw.println(msg);
        }
        System.out.println("over");
        pw.close();

    }
}
