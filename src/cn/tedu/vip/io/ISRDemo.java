package cn.tedu.vip.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ʹ��ת�����������ֽ���ת��Ϊ�ַ���
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");

        int d;

        while ((d=isr.read())!=-1) {
            System.out.print((char)d);
        }
        System.out.println("\nover");
        isr.close();
    }
}
